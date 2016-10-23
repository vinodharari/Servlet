package com.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper{
	public RequestWrapper(HttpServletRequest req){
		super(req);
	}
	@Override
	public String getParameter(String name){
		String s1=super.getParameter(name);
		if(s1==null){
			s1="no value to "+name;
		}
		if(s1=="vinod"){
			s1="you entered vinod to "+name;
		}
		return s1;
	}
}