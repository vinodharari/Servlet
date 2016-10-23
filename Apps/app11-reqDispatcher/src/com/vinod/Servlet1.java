package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet1 extends HttpServlet {
	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		PrintWriter out=r2.getWriter();
		String s1=r1.getParameter("param1");
		String s2=new StringBuffer(s1).reverse().toString();
		System.out.println(s1+","+s2);
		r1.setAttribute("results", s2);
		r2.setContentType("text/html");
		System.out.println("Servlet1-doGet-begin(sop)");
		out.println("Servlet1-doGet-begin(out)<br>");
		out.println("param in s1: "+s1+"<br>");
		out.println("rparam in s1: "+s2+"<br>");
				
//		ServletContext c1=getServletContext();
//		RequestDispatcher rd=c1.getRequestDispatcher("/Servlet2");
		
		RequestDispatcher rd=r1.getRequestDispatcher("/Servlet2");
		rd.forward(r1, r2);
//		rd.include(r1, r2);
		
//		r2.sendRedirect("Servlet2");
		System.out.println("Servlet1-doGet-end(sop)");
		out.println("<br>Servlet1-doGet-end(out)");
	}
}
