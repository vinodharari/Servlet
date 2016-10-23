package com.vinod;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{
	private LoginService loginservice=new LoginService();

	public void init() throws ServletException{
		System.out.println("inside init");
	}

	public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		LoginForm lf=new LoginForm();
		out.println("it is inside doPost");
		lf.setUsername(r1.getParameter("username"));
		lf.setPassword(r1.getParameter("password"));
		
		if(loginservice.verifyCreds(lf)){
			out.println("login success");
		}
		else{
			out.println("login failed");
		}
	}

	public void destroy(){
		System.out.println("inside destroy");
	}

}

