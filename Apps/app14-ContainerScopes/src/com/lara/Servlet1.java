package com.lara;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		r1.setAttribute("attr1", "Hello from Servlet1");
		r1.setAttribute("attr2", 10000);
		r1.setAttribute("attr3", new String[] {"abc","xyz"});
		RequestDispatcher rd=r1.getRequestDispatcher("Servlet2");
		rd.forward(r1, r2);
	}
}
