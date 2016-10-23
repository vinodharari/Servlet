package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {
	private FilterConfig config;

	public void init(FilterConfig config) throws ServletException {
		this.config=config;
	}
	
	public void doFilter(ServletRequest r1, ServletResponse r2, FilterChain chain) throws IOException, ServletException {
		System.out.println("Inside doFilter01");
		PrintWriter out = r2.getWriter();
		out.println("Inside F1 <br>");
		String s1=config.getInitParameter("vinod");
		out.println("vinod : "+s1+"<br>");
		chain.doFilter(r1, r2);
		System.out.println("Outside doFilter01");
		out.println("outside F1 <br>");
		ServletContext c1=config.getServletContext();
		String s2=c1.getInitParameter("driver");
		out.println("driver : "+s2+"<br>");
	}
	
	public void destroy() {}
}
