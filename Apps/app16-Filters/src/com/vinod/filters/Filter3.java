package com.vinod.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter3 implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter3-init");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter3-doFilter-begin");
		System.out.println("do filter operations here");
		PrintWriter out=response.getWriter();
		out.println("Filter3-doFilter-begin\n");
		chain.doFilter(request, response);
		System.out.println("Filter3-doFilter-end");
		out.println("Filter3-doFilter-end\n");
	}
	
	public void destroy() {
		System.out.println("Filter3-destroy");
	}

}
