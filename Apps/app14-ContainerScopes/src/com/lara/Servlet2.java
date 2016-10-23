package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		String s1=(String)r1.getAttribute("attr1");
		int s2=(Integer)r1.getAttribute("attr2");
		String[] s3=(String[])r1.getAttribute("attr3");
		out.println(s1+"<br>");
		out.println(s2+"<br>");
		out.println(toString()+"<br>");
	}
}
