package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;
public class Servlet2 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String[] fName=r1.getParameterValues("firstName");
		String[] skills=r1.getParameterValues("skills");
		
		PrintWriter out=r2.getWriter();
		r2.setContentType("text/html");
		out.println("First Name : "+Arrays.toString(fName)+"</br>");
		out.println("Skills : "+Arrays.toString(skills)+"</br>");
	}

}
