package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		// TODO Auto-generated method stub
		
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String n=request.getParameter("uname");
	         String m=request.getParameter("pass");
	         HttpSession session = null;
	 		
	             if((n.equals("surabhi"))&& (m.equals("welcome")))
	         {
	        	 
	        	 session=request.getSession();  
	             session.setAttribute("uname",n);  
	               
	             //retrieving data from ServletContext object  
	             ServletContext ctx=getServletContext();  
	             int t=(Integer)ctx.getAttribute("totalusers");  
	             int c=(Integer)ctx.getAttribute("currentusers");  
	            System. out.print("<tr>total users= "+t);  
	             System.out.print("<tr>current users= "+c);  
	               
	            System. out.print("<br><a href='LogoutServlet'>logout</a>");  
	                
	           response.sendRedirect("welcome.jsp"); 
	         }
	         else
	         {
	        	 response.getWriter().append("Please provide correct detail");
	        	 RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
	        	 rd.include(request, response); 
	        	 
	         }
			
	
	
  
		 
	}
}
