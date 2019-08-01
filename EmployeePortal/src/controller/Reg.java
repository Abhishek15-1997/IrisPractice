package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.EmployeeDao_Impl;


@WebServlet("/Reg")
public class Reg extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		String s1=request.getParameter("fname");
		String s2=request.getParameter("lname");
		String s3=request.getParameter("ph_no");
		int age=Integer.parseInt(request.getParameter("age"));
		String s4=request.getParameter("gender");
		String s5=request.getParameter("pass");
		String s6=request.getParameter("email");
		
		
		System.out.println(s4);
		
		RequestDispatcher rq;
		EmployeeDao_Impl emp=new EmployeeDao_Impl();
		System.out.println("asdfg");
		if(emp.register(s1, s2, s4, s3, age, s5))
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

