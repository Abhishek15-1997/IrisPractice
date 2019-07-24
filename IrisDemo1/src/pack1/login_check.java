package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/login_check")
public class login_check extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//response.setContentType("text/html");
		
		String e1=request.getParameter("email");
		String p1=request.getParameter("pass");
		
		
		PrintWriter out=response.getWriter();
			
		
		if(e1.equals("abc@gmail.com") && p1.equals("abc"))
		{
			out.print("you are logged in");
		}
		else
			out.print("you cannot log in");						
	}

}
