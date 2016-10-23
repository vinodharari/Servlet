package com.vinod;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{

	public void init() throws ServletException{
		System.out.println("inside init");
	}

	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		out.println("it is in doGet");
		System.out.println("inside doGet");
	}

	public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		out.println("it is inside doPost");
		destroy();
		System.out.println("inside doPost");
	}

	public void destroy(){
		System.out.println("inside destroy");
	}

}

