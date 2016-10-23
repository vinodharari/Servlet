package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		System.out.println("from Servlet2");
		PrintWriter out=r2.getWriter();
		out.println("from Servlet2");
	}
}
