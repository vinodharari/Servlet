package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet4
 */
public class Servlet6 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		r1.setAttribute("attr1", 1000);
		System.out.println("......");
		r1.setAttribute("attr2", 2000);
		System.out.println("......");
		r1.removeAttribute("attr1");
		PrintWriter out=r2.getWriter();
		out.println("check in the log file");
	}
}
