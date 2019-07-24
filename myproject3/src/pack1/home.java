package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
	String name=(String)request.getAttribute("first_name");
	PrintWriter out=response.getWriter();
	
	
	
	
	out.println("<div align='center'><h1 style='color:green'>Welcome "+name+" to the home page</h1>");
	
	out.println("<a href='view_profile'>View Profile</a>");
	out.println("<a href='update_profile.html'>Update Profile</a></div>");
	}

}
