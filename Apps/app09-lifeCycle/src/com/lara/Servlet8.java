package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet8 extends HttpServlet {
	protected void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		Thread t1=Thread.currentThread();
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		out.println("id : "+t1.getId());
	}
}
