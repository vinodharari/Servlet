package com.vinod;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionLifeCycleListener implements HttpSessionListener{

	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("session created to new user");
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("session destroyed for an existing user");
	}

}
