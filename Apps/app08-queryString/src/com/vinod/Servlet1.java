package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String fName=r1.getParameter("firstName");
		String skills=r1.getParameter("skills");
		
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		out.println("First Name : "+fName+"</br>");
		out.println("Skills : "+skills+"</br>");
	}

}
