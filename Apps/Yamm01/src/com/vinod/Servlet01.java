package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet01 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("inside doGet method</br>");
		
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		
		out.println("UserName is : "+un+"</br>");
		out.println("Password : "+pw+"</br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("inside doPost method");
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		
		out.println("UserName : "+un+"</br>");
		out.println("Password : "+pw+"</br>");
	}
}
