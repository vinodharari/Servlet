package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String n1 = r1.getParameter("num1");
		String n2 = r1.getParameter("num2");
		String aType = r1.getParameter("actionType");
		PrintWriter out = r2.getWriter();
		
		String message = "";
		int i=Integer.parseInt(n1);
		int j=Integer.parseInt(n2);
		int result=0;
		
		if("add".equals(aType)){
			result = i+j;
			message = "Adding "+i+" to "+j+" : "+result;
		}
		if("sub".equals(aType)){
			result = i-j;
			message = "Subtracting "+i+" from "+j+" : "+result;
		}
		if("multi".equals(aType)){
			result = i*j;
			message = "Multiplying "+i+" with "+j+" : "+result;
		}
		if("div".equals(aType)){
			result = i/j;
			message = "Division of "+i+" with "+j+" : "+result;
		}
		out.println(message);
	}
}
