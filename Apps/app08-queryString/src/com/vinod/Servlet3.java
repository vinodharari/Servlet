package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		String qryString = r1.getQueryString();
		PrintWriter out = r2.getWriter();
		out.println("Qry String : "+qryString);
		String[] params = qryString.split("&");
		String name, value;
		int index=0;
		for(String param:params){
			index=param.indexOf("=");
			name=param.substring(0,index);
			value=param.substring(index+1, param.length());
			out.println("Parameter : "+param+"<br>");
			out.println("Name : "+name+"<br>");
			out.println("Value : "+value+"<br>");
			out.println("<hr><br>");
		}
	}
}
