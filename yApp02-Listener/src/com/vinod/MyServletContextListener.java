package com.vinod;

import java.io.PrintWriter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyServletContextListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("***** context Initialized *****");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("***** context Destroyed *****");
	}

}
