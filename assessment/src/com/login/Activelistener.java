package com.login;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Activelistener
 *
 */
@WebListener
public class Activelistener implements HttpSessionListener {
	
	  ServletContext ctx=null;  
	  static int total=0,current=0;

    /**
     * Default constructor. 
     */
    public Activelistener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent e)  { 
    	
    	total++;  
	    current++;  
	      
	    ctx=e.getSession().getServletContext();  
	    ctx.setAttribute("totalusers", total);  
	    ctx.setAttribute("currentusers", current);  
	      
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	
    	current--;  
        ctx.setAttribute("currentusers",current);  
         // TODO Auto-generated method stub
    }
	
}
