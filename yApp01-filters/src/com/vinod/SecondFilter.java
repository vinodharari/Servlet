package com.vinod;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FirstFilter
 */
public class SecondFilter implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("*****Second Filter-Init*****");
	}
	public void doFilter(ServletRequest r1, ServletResponse r2, FilterChain chain) throws IOException, ServletException {
		System.out.println("*****Second Filter-doFilter*****");
		chain.doFilter(r1,r2);
	}
	
	public void destroy() {
		System.out.println("*****Second Filter-Destroy*****");
	}
	

}
