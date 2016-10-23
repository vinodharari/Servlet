package com.vinod;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLifeCycleListener implements ServletRequestListener{

	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("Request Initialized");
	}
	
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("Request Destroyed");
	}
}
