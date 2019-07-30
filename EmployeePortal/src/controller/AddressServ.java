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

import Entity.Address;
import Entity.AddressDao_Impl;

@WebServlet("/AddressServ")
public class AddressServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("State");
		String s2=request.getParameter("City");
		String s3=request.getParameter("Locality");
		int s4=Integer.parseInt(request.getParameter("HouseNo"));
		int s5=Integer.parseInt(request.getParameter("PinCode"));
		RequestDispatcher rd;
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		int empid=(int)session.getAttribute("empId");
		
		Address ad=new Address();
		ad.setEmpid(empid);
		ad.setState(s1);
		ad.setCity(s2);
		ad.setLocality(s3);
		ad.setHouseNo(s4);
		ad.setPinCode(s5);
		
		AddressDao_Impl adi=new AddressDao_Impl();
		boolean b=adi.addAddress(ad);
		
		if(b)
		{	
			rd=request.getRequestDispatcher("HomeForEmp.jsp");
		out.println("<html><body><script>alert('Successful');</script></body></html>");
		rd.include(request, response);
		
	}
	else
	{
		rd=request.getRequestDispatcher("HomeForEmp.jsp");
		
		out.println("<html><body><script>alert('Unsuccessful');</script></body></html>");
		rd.include(request, response);
	}		
		
		
		
		
		
		
	}



}
