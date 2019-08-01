package filters;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/HomeForEmp.jsp")
public class TimeFilter implements Filter {

   
    public TimeFilter() {
       
    }

	
	public void destroy() {
		System.out.println("destroyed ");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("inside dofilter");
		
		HttpServletRequest rq=(	HttpServletRequest)request;
		HttpServletResponse rs=(HttpServletResponse)response;
		LocalDateTime ldt=LocalDateTime.now();
		
		int hr=ldt.getHour();
		if(hr>9 && hr<17)
		{
			String ipaddr=rq.getRemoteAddr();
			
			chain.doFilter(request, response);
		}
		else
		{
			rs.sendRedirect("LogIn.jsp");
		}
	
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("inside init");
	}

}
