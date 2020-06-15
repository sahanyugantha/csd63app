package com.sahan.csd63app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	
	//allows for any HTTP method.
/*	
 	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String email = request.getParameter("uemail");
		String password = request.getParameter("upass");
		
		//System.out.println("Email is "+email+" and Password is "+password);
		
		PrintWriter writer = response.getWriter();
		
		if(email.equals("sahan@bcas.lk") && password.equals("123")) {
			
			//Redirecting to a page.
			response.sendRedirect("index.jsp");
			
		} else {
			writer.println("login failed");
		}
		
	}
	
*/	
	//HTTP Methods - GET and POST
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		String email = req.getParameter("uemail");
		String password = req.getParameter("upass");
		
		System.out.println("Email is "+email+" and Password is "+password);
	}
	
//	@Override
//	public void doGet(HttpServletRequest req, HttpServletResponse res) {
//		
//		String email = req.getParameter("uemail");
//		String password = req.getParameter("upass");
//		
//		System.out.println("Email is "+email+" and Password is "+password);
//	}
	

}
