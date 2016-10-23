package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Filter01
 */
public class Filter01 implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter1-init");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		System.out.println("Filter1-doFilter-begin");
		System.out.println("do filter operations here");
		out.println("Filter1-doFilter-begin");
		out.println("do filter operations here");
		chain.doFilter(request, response);
		System.out.println("Filter1-doFilter-end");
	}
	
	public void destroy() {
		System.out.println("Filter1-destroy");
	}


}
