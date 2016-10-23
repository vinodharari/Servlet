package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Servlet3() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Employee emp=(Employee)session.getAttribute("emp");
		PrintWriter out=response.getWriter();
		out.println(emp.getParam1());
	}
}
