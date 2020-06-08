package com.sahan.csd63app;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		String email = request.getParameter("uemail");
		String password = request.getParameter("upass");
		
		System.out.println("Email is "+email+" and Password is "+password);
	}
	
	

}
