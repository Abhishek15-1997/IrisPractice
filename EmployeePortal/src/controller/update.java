package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.*;
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		System.out.println("aaaaaaaaaa");
		RequestDispatcher rq;
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		int id=(int)session.getAttribute("empId");
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String phno=request.getParameter("phno");
		String pass=request.getParameter("pass");
		
		System.out.println(fname+" "+lname+" "+age+" "+gender+" "+phno+" "+pass+" "+id);
		
		
		EmployeeDao_Impl e=new EmployeeDao_Impl();
		boolean b=e.update( id, fname, lname, gender, phno, age, pass);
		if(b==true)
		{		
		System.out.println("update");
		rq=request.getRequestDispatcher("LogIn.jsp");
		session.invalidate();
		out.println("<html><body><script>alert('Successful');</script></body></html>");
		rq.include(request, response);
		
	}
	else
	{
		rq=request.getRequestDispatcher("HomeForEmp.jsp");
		
		out.println("<html><body><script>alert('Unsuccessful');</script></body></html>");
		rq.include(request, response);
	}		
		
	}


}
