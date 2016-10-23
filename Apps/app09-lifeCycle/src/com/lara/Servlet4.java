package com.lara;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public abstract class Servlet4 extends HttpServlet {
    public Servlet4() {
        System.out.println("Servlet4()");
    }

    public void init(ServletConfig config)
    {
    	System.out.println("from init(config)");
    }

    public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
    {
    	System.out.println("from service(request, response)");
    }
    
    public void destroy() 
    {
    	System.out.println("from destroy()");
    }

}
