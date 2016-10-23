package com.vinod;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		System.out.println("Hello from first Servlet");
	}
}

