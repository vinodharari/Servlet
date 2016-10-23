package com.y3.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet2 extends HttpServlet {
	
	public void init() throws ServletException {
		System.out.println("Inside Init");
	}
	public void doPost(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String s1 = r1.getParameter("param1");
		String s2 = r1.getParameter("param2");
		PrintWriter out = r2.getWriter();
		out.println("from the Servlet");
		out.println("Parameter 1: " + s1);
		out.println("Parameter 2: " + s2);		
	}
	public void destroy() {
		System.out.println("Inside Destroy");
	}
}
