package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet2 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		PrintWriter out = r2.getWriter();
		r2.setContentType("text/html");
	
		Cookie[] cookies=r1.getCookies();
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				out.println(cookie.getName()+":");
				out.println(cookie.getValue()+"<br>");
			}
		}
		else {
			out.println("No cookies available<br>");
		}
		String s3=r1.getParameter("age");
		String s4=r1.getParameter("email");
		String s5=(String)r1.getAttribute("fullName");
		out.println("Age :"+s3+"<br>");
		out.println("Email :"+s4+"<br>");
		out.println("Full Name :"+s5+"<br>");
		
	}
}
