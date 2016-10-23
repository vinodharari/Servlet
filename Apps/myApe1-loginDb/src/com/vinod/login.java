package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String un = r1.getParameter("username");
		String pw = r1.getParameter("password");
		PrintWriter out = r2.getWriter();

		if("vinod".equals(un)&&"jain".equals(pw)){
			out.println("Login Success");
		}
		else{
			out.println("Login Failed");
		}
	}
}
