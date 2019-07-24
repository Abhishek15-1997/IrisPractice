package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
/**
 * Servlet implementation class view_profile
 */
@WebServlet("/view_profile")
public class view_profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		String email=(String)session.getAttribute("email");
			System.out.println(email);
		
		try
		{
			Connection conn=(Connection)getServletContext().getAttribute("connection");
			PreparedStatement ps=conn.prepareStatement("select * from usertable where email=? ");
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();		
			if(rs.next())
			{
				String s2=rs.getString(2);
				
				String s3=rs.getString(3);
				String s4=rs.getString(4);
				String s5=rs.getString(5);
				out.println("<div align='center' ><h1 style='color:green'>Welcome "+s3+" to view profile</h1>");
				out.println("Your email is :"+email +"<br></br>Your Password is: "+s2+"<br></br>Your first name is "+s3+"<br></br>Your last name is:"+s4+"<br></br>Your age is:"+s5+"</div>");
			}
			else
				out.print("hello");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
	}

}
