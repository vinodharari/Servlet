package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParameterMap
 */
public class ParameterMap extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Map params=request.getParameterMap();
		String[] fNames=(String[])params.get("firstName");
		String[] skills=(String[]) params.get("skills");
		
		out.println("FirstNames : "+fNames);
		out.println("Skills : "+skills);
	}
}
