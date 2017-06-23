package com.test.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginExample
 */
@WebServlet("/LoginExample")
public class LoginExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
      
        String n=request.getParameter("user");  
        out.print("Welcome "+n);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",n);  
          
        //retrieving data from ServletContext object  
        ServletContext ctx=getServletContext();  
        int t=(Integer)ctx.getAttribute("totalusers");  
        int c=(Integer)ctx.getAttribute("currentusers");  
        out.print("<br>total users= "+t);  
        out.print("<br>current users= "+c);  
          
        out.print("<br><a href='LogOutExample'>logout</a>");  
          
        out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
