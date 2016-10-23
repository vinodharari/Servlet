package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		PrintWriter out=r2.getWriter();
		String s1=r1.getParameter("param1");
		String s2=(String)r1.getAttribute("results1");
		
		System.out.println("Servlet3-doGet-begin(sop)");
		out.println("Servlet3-doGet-begin(out)<br>");
		
		out.println("param in S3: "+s1+"<br>");
		out.println("rparam in S3: "+s2+"<br>");
		
		System.out.println("Servlet3-doGet-end(sop)");
		out.println("Servlet3-doGet-end(out)");
	}
}
