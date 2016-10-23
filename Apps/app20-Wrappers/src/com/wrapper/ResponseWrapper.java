package com.wrapper;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ResponseWrapper extends HttpServletResponseWrapper{

	public ResponseWrapper(HttpServletResponse response) {
		super(response);
	}
	
	@Override
	public void setContentType(String type){
		super.setContentType("text/html");
	}
}
