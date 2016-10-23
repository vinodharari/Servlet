package com.vinod;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppLifeCycleListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("app15 started...");
	}
	public void contextDestroyed(ServletContextEvent event){
		System.out.println("app15 stopped...");
	}
}
