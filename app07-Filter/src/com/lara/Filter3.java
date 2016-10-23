package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Filter3
 */
public class Filter3 implements Filter {
	private FilterConfig config;
	public void init(FilterConfig config) throws ServletException {
		this.config=config;
		System.out.println("Filter3-init");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String s1=config.getInitParameter("con1");
		ServletContext c1=config.getServletContext();
		String s2=c1.getInitParameter("driver");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("Filter4-doFilter-begin<br>");
		out.println("con 1 : "+s1+"<br>");
		out.println("driver : "+s2+"<br>");
		chain.doFilter(request, response);
	}
	
	public void destroy() {
		System.out.println("Filter4-destroy");
	}
}
