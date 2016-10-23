package com.vinod;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		System.out.println("Hello from first Servlet");
		PrintWriter out=r2.getWriter();
		out.println("From First Servlet");

		String usernameArr[] = r1.getParameterValues("username");
		String password = r1.getParameter("password");
		Map<String, String[]> map=r1.getParameterMap();

		for(Map.Entry entry:map.entrySet()){
			out.println(entry.getKey());
			
			out.println(entry.getValue());
		}

		out.println("Password: "+password);
	}
}

