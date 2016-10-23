package com.wrapper;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Filter1 implements Filter{
	public void init(FilterConfig arg0) throws ServletException {}
	
	public void doFilter(ServletRequest r1, ServletResponse r2,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hReq=(HttpServletRequest)r1;
		HttpServletResponse hRes=(HttpServletResponse)r2;
		RequestWrapper wReq=new RequestWrapper(hReq);
		ResponseWrapper wRes=new ResponseWrapper(hRes);
		chain.doFilter(wReq, wRes);
	}
	
	public void destroy() {}
}
