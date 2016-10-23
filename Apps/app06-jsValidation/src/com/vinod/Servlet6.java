package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet6 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String firstName = r1.getParameter("firstName");
		String lastName = r1.getParameter("lastName");
		String[] skills = r1.getParameterValues("skills");
		
		PrintWriter out = r2.getWriter();
		out.println("First Name: " + firstName + "<br>");
		out.println("Lover Name: " + lastName + "<br>");
		out.println("Skills");
			for(String str: skills){
				out.println(str+ "," + "<br>");
			}
	}	
}
