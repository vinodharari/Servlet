package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		HttpSession session=r1.getSession();
		session.setAttribute("attr1", "Hello from Servlet1");
		session.setAttribute("attr2", 10000);
		session.setAttribute("attr3", new String[] {"abc","xyz"});
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		out.println("<a href='"+r2.encodeURL("Servlet4")+"'>Servlet4</a>");
	}
}
