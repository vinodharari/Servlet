package com.vinod;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.authenticate(response)){
			response.setContentType("text/html");
			response.getWriter().println("user "+request.getRemoteUser()+"is now authenticated...");
		} else {
			System.out.println("failure to authenticate");
		}
	}
}
