package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String firstName = r1.getParameter("firstName");
		String loverName = r1.getParameter("loverName");
		String address = r1.getParameter("address");
		String gender = r1.getParameter("gender");
		String[] skills = r1.getParameterValues("skills");
		String education = r1.getParameter("education");
		
		PrintWriter out = r2.getWriter();
		out.println("First Name: " + firstName + "<br>");
		out.println("Lover Name: " + loverName + "<br>");
		out.println("Address: " + address + "<br>");
		out.println("Gender: " + gender + "<br>");
		out.println("Skills");
			for(String str: skills){
				out.println(str+ "," + "<br>");
			}
		out.println("Education: " + education + "<br>");
	}	
}
