package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter02 implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {}
	
	public void doFilter(ServletRequest r1, ServletResponse r2, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=r2.getWriter();
		out.println("indide F2 <br>");
		System.out.println("inside F2");
		chain.doFilter(r1, r2);
		out.println("outside F2 <br>");
		System.out.println("outside F2");
	}

	public void destroy() {}
}
