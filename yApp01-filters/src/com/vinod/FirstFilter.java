package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FirstFilter
 */
public class FirstFilter implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("*****First Filter-Init*****");
	}
	public void doFilter(ServletRequest r1, ServletResponse r2, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=r2.getWriter();
		System.out.println("*****First Filter-doFilter*****");
		System.out.println("*****before filter*****");
		out.println("before filter");
		chain.doFilter(r1,r2);
		System.out.println("*****after filter*****");
		out.println("after filter");
	}
	
	public void destroy() {
		System.out.println("*****First Filter-Destroy*****");
	}
	

}
