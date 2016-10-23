package com.vinod.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter1-init");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter1-doFilter-begin");
		System.out.println("do filter operations here");
		chain.doFilter(request, response);
		System.out.println("Filter1-doFilter-end");
	}
	
	public void destroy() {
		System.out.println("Filter1-destroy");
	}

}
