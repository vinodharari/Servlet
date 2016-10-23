package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet01
 */
@WebServlet("/servlet01")
public class servlet01 extends HttpServlet {
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException{
		PrintWriter out = r2.getWriter();
		out.println("Hello world!! through out");
		System.out.println("Hello world!! through sop");
	}
}
