package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet  {
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException{
		PrintWriter out = r2.getWriter();
		out.println("Hello world!! through out");
		System.out.println("Hello world!! through sop");
		ServletConfig con=getServletConfig();
		out.println(con);
	}
}