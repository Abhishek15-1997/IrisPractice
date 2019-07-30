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


@WebServlet("/searchEmp")
public class searchEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String empid=request.getParameter("search");
		int eid=Integer.parseInt(empid);
		EmployeeDao_Impl e=new EmployeeDao_Impl();
		EmployeeDetails ed=e.search(eid);
		RequestDispatcher rd;
		
		
		if(ed!=null)
		{
			System.out.println(ed.getEmpid());
			
			
			rd=request.getRequestDispatcher("SearchEmployee.jsp");
			rd.include(request, response);
			out.println("<html><div align='center'><body><h4> Emp id: </h4>"+ed.getEmpid()+"<br><h4> Emp first name: </h4>"+ed.getF_name()+"<br><h4> Emp Last name: </h4>"+ed.getL_name()+"<br><h4> Emp Age: </h4> "+ed.getAge()+"<br><h4> Emp gender: </h4> "+ed.getGender()+"<br><h4> Emp Phone no: </h4> "+ed.getPhoneNo()+"<br><h4> Emp password: </h4> "+ed.getPass()+"</body></div></html>");
			
		}
		else
		{
			
		}
	}

	
	

}
