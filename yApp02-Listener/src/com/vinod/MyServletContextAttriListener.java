package com.vinod;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MyServletContextAttriListener implements HttpSessionListener{

	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("***** session created *****");
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("***** session Destroyed *****");
	}

}
