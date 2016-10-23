package com.vinod;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		out.println("it is in doPost");
		handleRequest(r1,r2);
	}

	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		out.println("it is in doGet");
		handleRequest(r1,r2);
	}

	public void handleRequest(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		out.println("<b>This is from LoginServlet handleRequest</b>");
	}
}

