package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

@WebServlet("/validate")
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("email");
		String s2=request.getParameter("pass");
		
		
		RequestDispatcher rd;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			ServletContext context=getServletContext();
			context.setAttribute("connection", conn);
			
			PreparedStatement ps=conn.prepareStatement("select * from usertable where email=? and password=? ");
			ps.setString(1, s1);
			ps.setString(2, s2);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				
				HttpSession session=request.getSession();
				session.setAttribute("email",s1);
				
				String s3=rs.getString(3);
				request.setAttribute("first_name", s3);
				
				rd=request.getRequestDispatcher("home");
				rd.forward(request, response);
				
			}
			else
			{
				 rd=request.getRequestDispatcher("welcome.html");
				out.println("invalid email and password");
				rd.include(request, response);
								
			}
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
