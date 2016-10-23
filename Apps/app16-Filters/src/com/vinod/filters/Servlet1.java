package com.vinod.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		System.out.println("from Servlet1");
		PrintWriter out=r2.getWriter();
		out.println("check in the log file");
	}

}
