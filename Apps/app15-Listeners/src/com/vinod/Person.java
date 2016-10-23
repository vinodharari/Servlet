package com.vinod;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Person implements HttpSessionBindingListener{
	public void valueBound(HttpSessionBindingEvent event){
		System.out.println("person obj bound to session");
	}
	public void valueUnbound(HttpSessionBindingEvent event){
		System.out.println("person obj Unbound to session");
	}

}
