package com.lara;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("username");
		String s2=request.getParameter("username");
		RequestDispatcher rd=null;
		if("lara".equals(s1)&&"rst".equals(s2)){
			request.setAttribute("success message", "Login Success");
			rd=request.getRequestDispatcher("test5.jsp");
		}
		else {
			request.setAttribute("error message", "Login Failed");
			rd=request.getRequestDispatcher("test4.jsp");
		}
		rd.forward(request, response);
	}

}
