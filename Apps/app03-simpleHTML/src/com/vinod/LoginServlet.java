package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private LoginService loginService = new LoginService();

	public void init() throws ServletException {
		System.out.println("inside init");
	}
	
	public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException{
		PrintWriter out = r2.getWriter();
		LoginForm lf=new LoginForm();
		lf.setUsername(r1.getParameter("userName"));
		lf.setPassword(r1.getParameter("password"));

		if(loginService.verifyCredentials(lf)){
			out.println("Login Success");
		}
		else {
			out.println("Login Failed");
		}
	}

}
