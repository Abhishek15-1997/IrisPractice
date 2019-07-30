package controller;

import java.io.IOException;
import java.io.PrintWriter;

import Entity.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		RequestDispatcher rq;
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		EmployeeDetails emp2=(EmployeeDetails)session.getAttribute("Employee/Admin");
		int empid=emp2.getEmpid();
		EmployeeDao_Impl e=new EmployeeDao_Impl();
		
		boolean b=e.delete(empid);
		if(b)
		{		
		System.out.println("inside emp reg");
		rq=request.getRequestDispatcher("LogIn.jsp");
		out.println("<html><body><script>alert('Successful');</script></body></html>");
		rq.include(request, response);
		
	}
	else
	{
		rq=request.getRequestDispatcher("LogIn.jsp");
		
		out.println("<html><body><script>alert('Unsuccessful');</script></body></html>");
		rq.include(request, response);
	}			
  }
}
