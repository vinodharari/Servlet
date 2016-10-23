package com.vinod.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		System.out.println("from Servlet3");
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		out.println("from Servlet3<br>");
	}

}
