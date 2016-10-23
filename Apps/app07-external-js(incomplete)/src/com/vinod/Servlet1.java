package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String s1 = r1.getParameter("param1");
		String s2 = new StringBuffer(s1).reverse().toString();
		PrintWriter out = r2.getWriter();
		out.println("Parameter 1: " + s1);
		out.println("<br> Reversed Parameter 1: " + s2);		
	}
}
