package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		PrintWriter out=r2.getWriter();
		String s1=r1.getParameter("param1");
		String s2=(String)r1.getAttribute("results");
		
		r2.setContentType("text/html");
		System.out.println("Servlet2-doGet-begin(sop)");
		out.println("Servlet2-doGet-begin(out)<br>");
		out.println("param in s2: "+s1+"<br>");
		out.println("rparam in s2: "+s2+"<br>");
		
		r1.setAttribute("results1", s2);
		RequestDispatcher rd=r1.getRequestDispatcher("/Servlet3");
//		rd.include(r1, r2);
		rd.forward(r1, r2);		
		System.out.println("Servlet2-doGet-end(sop)");
		out.println("Servlet2-doGet-end(out)");
	}
}
