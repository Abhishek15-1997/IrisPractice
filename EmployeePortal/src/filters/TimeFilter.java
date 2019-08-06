package filters;

import java.io.IOException;
import java.io.PrintWriter;
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


@WebFilter("/validateEmployee")
public class TimeFilter implements Filter {

   
    public TimeFilter() {
       
    }
	
	public void destroy() {
		System.out.println("destroyed ");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("inside dofilter");
		response.setContentType("text/html");
		//PrintWriter out=rs.getWriter();
		HttpServletRequest rq=(	HttpServletRequest)request;
		HttpServletResponse rs=(HttpServletResponse)response;
		
		LocalDateTime ldt=LocalDateTime.now();
		
		int hr=ldt.getHour();
		if(hr>20 )
		{
			//String ipaddr=rq.getRemoteAddr();
			System.out.println("hour..."+hr);
			chain.doFilter(request, response);
		}
		else
		{
			System.out.println("..... dofilter"+hr);
			rs.sendRedirect("Welcome.jsp");
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("inside init");
	}

}
