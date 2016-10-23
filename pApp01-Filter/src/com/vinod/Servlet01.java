package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet01
 */
public class Servlet01 extends HttpServlet {
	
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		System.out.println("servlet operations here!!!");
		PrintWriter out=r2.getWriter();
		out.println("from servlet01");
	}

}
