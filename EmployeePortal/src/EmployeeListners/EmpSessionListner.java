package EmployeeListners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class EmpSessionListner implements HttpSessionListener {
	
	public static int count=0;
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	/*HttpSession session=arg0.getSession();
    	ServletContext context=session.getServletContext();
    	Object o=context.getAttribute("count");
    	if(o==null)
    	{
    		context.setAttribute("count", 1);
    	}
    	else
    	{
    		int c=(int)o;
    		c++;
    		context.setAttribute("count",  c);
    	}*/
    	
    	count++;
    	
    }


    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        if(count>0)
        	count--;
    	
    	
    }
	
}
