package com.vinod;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("*****Attribute added*****");
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("*****Attribute removed*****");
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("*****Attribute replaced*****");
		
	}

	
}
