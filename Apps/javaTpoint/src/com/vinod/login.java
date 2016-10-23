package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private LoginService ls=new LoginService();
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		PrintWriter out=r2.getWriter();
		LoginForm lf=new LoginForm();
		lf.setUsarname(r1.getParameter("username"));
		lf.setPassword(r1.getParameter("password"));
			if(ls.verifyCredentials(lf)){
				out.println("Login Success");
			}
			else{
				out.println("Login Failed");
			}
		ServletConfig config=getServletConfig();
	}
}

