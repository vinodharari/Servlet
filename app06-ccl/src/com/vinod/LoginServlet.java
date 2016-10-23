package com.vinod;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;

public class LoginServlet extends HttpServlet{
	
	public void init() throws ServletException{
		System.out.println("inside init");
		System.out.println("it is inside init  "+getServletConfig().getInitParameter("pi"));
		System.out.println("it is inside init  "+getServletConfig().getInitParameter("country"));
		System.out.println("Config parameter  "+getServletContext().getInitParameter("name"));
		
	}

	public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		ServletConfig config=getServletConfig();
		out.println("\nConfig parameter  "+config.getInitParameter("pi")+"</br>");
		out.println("\nContext parameter  "+getServletContext().getInitParameter("name"));

	}

	public void destroy(){
		System.out.println("inside destroy");
		System.out.println("it is inside destroy  "+getServletConfig().getInitParameter("country"));
		System.out.println("Config parameter  "+getServletContext().getInitParameter("name"));
	}

}

