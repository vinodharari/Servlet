package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String s1 = r1.getParameter("firstName");
		String s2 = r1.getParameter("lastName");
		String s3 = r1.getParameter("age");
		String s4 = r1.getParameter("address");
		String s5 = r1.getParameter("gender");
		String[] s6 = r1.getParameterValues("skills");
		String s7 = r1.getParameter("education");
		String s8 = r1.getParameter("loverName");
		PrintWriter out = r2.getWriter();
		out.println("from the Servlet");
		out.println("First Name: " + s1 + "<br>");
		out.println("Last Name: " + s2 + "<br>");
		out.println("Age: " + s3 + "<br>");
		out.println("Address: " + s4 + "<br>");
		out.println("Gender: " + s5 + "<br>");
		out.println("Skills");
			for(String str: s6){
				out.println(str+ "," + "<br>");
			}
		out.println("Education: " + s7 + "<br>");
		out.println("Lover Name: " + s8 + "<br>");
	}	
}
