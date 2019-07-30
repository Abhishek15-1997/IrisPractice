package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.*;
@WebServlet("/ViewAllEmps")
public class ViewAllEmps extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDao_Impl ed=new EmployeeDao_Impl();
			RequestDispatcher rd;
			List<EmployeeDetails> e=ed.ShowAllEmployees();
			
			HttpSession session=request.getSession();
			System.out.println("ViewAllEmp");
			if(e!=null)
			{
				session.setAttribute("EmpList", e);
				rd=request.getRequestDispatcher("ViewAllEmployee.jsp");
				rd.forward(request, response);
			
			}
			else
			{
				rd=request.getRequestDispatcher("HomeForAdmin.jsp");
				rd.forward(request, response);
			}
			
			
	}

	

}
