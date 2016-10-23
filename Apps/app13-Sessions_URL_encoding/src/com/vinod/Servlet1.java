package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		PrintWriter out = r2.getWriter();
		r2.setContentType("text/html");
		String s1 = r1.getParameter("firstName");
		String s2 = r1.getParameter("lastName");
				
		out.println("first Name : " + s1 + "<br>");
		out.println("last Name : " + s2 + "<br>");
		out.println("<hr>");
		String fullName=s1+" "+s2;
		r1.setAttribute("result", fullName);
		
		out.println("<form action='Servlet2?firstName="+s1+"&lastName="+s2+"&fullName="+fullName+"'method='post'>");
		out.println("Age : ");
		out.println("<input type='text' name='age'/><br>");
		out.println("Email : ");
		out.println("<input type=\"text\" name=\"email\"/><br>");
		out.println("<input type='submit' value='submit'/><br>");
		out.println("</form>");
		
		System.out.println("Hello world!!!");
	}
}
