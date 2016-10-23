package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		ServletContext c1=getServletContext();
		c1.setAttribute("attr1", "Hello from Servlet1");
		c1.setAttribute("attr2", "10000");
		c1.setAttribute("attr3", new String[] {"abc","xyz"});
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		out.println("done");
	}
}
