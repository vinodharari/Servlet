package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet03 extends HttpServlet {
	int i=0;
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		r2.setIntHeader("refresh", 5);
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		out.println(i++);
	}
}
