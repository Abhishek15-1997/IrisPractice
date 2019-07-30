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

import DataAccessObject.EmployeeDao;
import Entity.*;

@WebServlet("/validateEmployee")
public class validateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				
		String s1=request.getParameter("t1");
		String pass=request.getParameter("t2");
		
		int eid=Integer.parseInt(s1);
		
		EmployeeDao_Impl emp1=new EmployeeDao_Impl();

		
		EmployeeDetails emp2=emp1.validate(eid, pass);
		
		

		RequestDispatcher rd;
		if(emp2!=null)
		{
			System.out.println("if part");
						
			HttpSession session=request.getSession();
			
			session.setAttribute("empId", emp2.getEmpid());
			session.setAttribute("EmpAd", emp2);

			if(emp2.getRole().equals("Admin"))
			{
				System.out.println("inside admin");
				rd=request.getRequestDispatcher("HomeForAdmin.jsp");
				rd.forward(request, response);
			}
			else if(emp2.getRole().equals("Employee"))
			{
				System.out.println("inside employee");
				rd=request.getRequestDispatcher("HomeForEmp.jsp");
				rd.forward(request, response);
				
			}
				
		}
		else {
			rd=request.getRequestDispatcher("LogIn.jsp");
		rd.forward(request, response);
		}
			
		
					
			
	}
}

	




