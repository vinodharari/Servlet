package com.vinod;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class AppAtributesListener implements ServletContextAttributeListener{

	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("context attr added");
	}

	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("context attr removed");
	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("context attr replaced");
	}

}
