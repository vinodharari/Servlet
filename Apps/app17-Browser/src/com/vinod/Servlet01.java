package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet01 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		PrintWriter out=r2.getWriter();
		r2.setContentType("application/vnd.ms-excel");
//		r2.setContentType("application/notepad.exe");
//		r2.setContentType("text/html");
		Enumeration<String> names=r1.getHeaderNames();
		String name,value;
		while(names.hasMoreElements()){
			name=names.nextElement();
			value=r1.getHeader(name);
			out.println(name + ":" + value + "<br>");
		}
	}
}
