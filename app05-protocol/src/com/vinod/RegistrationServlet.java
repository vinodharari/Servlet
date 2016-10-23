package com.vinod;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet{
	public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws IOException,ServletException{
		PrintWriter out=r2.getWriter();
		out.println("FirstName: "+r1.getParameter("fName"));
		out.println("LastName: "+r1.getParameter("lName"));
		out.println("UserName: "+r1.getParameter("username"));
		out.println("Password: "+r1.getParameter("password1"));
		out.println("Re-Password: "+r1.getParameter("password2"));
		out.println("Phome: "+r1.getParameter("phone"));
		out.println("Address: "+r1.getParameter("address"));
		out.println("Gender: "+r1.getParameter("gender"));
		out.println("Technologies: ");
			/*for(String tech:r1.getParameterValues("tech")){
				out.println(tech +",");
			}*/
		out.println("State: " + r1.getParameter("state"));
	}
}

