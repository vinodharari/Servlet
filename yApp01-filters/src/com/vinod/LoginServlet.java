package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		PrintWriter out=r2.getWriter();
		out.println("inside Login Servlet");
		System.out.println("*****inside Login Servlet*****");
	}
}