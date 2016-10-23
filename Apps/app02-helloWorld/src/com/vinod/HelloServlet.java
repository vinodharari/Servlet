package com.vinod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException,IOException{
		PrintWriter out = r2.getWriter();
		out.println("Hello to all from first Servlet");
		out.close();
	}
}
