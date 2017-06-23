package com.test.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthFilter
 */

public class AuthFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out=response.getWriter();  
        String sessionPass=null;
	    String password=request.getParameter("pass");  
	    HttpSession session= ((HttpServletRequest)request).getSession(false);  
	   
	    if(session != null)
	    	sessionPass=(String)session.getAttribute("password");  
        
	    if("IamPass".equals(password) || "IamPass".equals(sessionPass) ){  
	    	chain.doFilter(request, response);//sends request to next resource  
	    }  
	    else{  
		    out.print("username or password error!");  
		    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
		    rd.include(request, response);  
	    }  
	    
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(fConfig.getInitParameter("test-param"));
	}

}
