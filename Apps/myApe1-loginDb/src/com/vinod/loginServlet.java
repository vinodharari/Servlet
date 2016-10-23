package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String un = r1.getParameter("username");
		String pw = r1.getParameter("password");
		PrintWriter out = r2.getWriter();
		Boolean loginStatus=authenticateUser(un,pw);
		
		if(loginStatus){
			out.println("Login Success");
		}
		else{
			out.println("Login Failed");
		}
	}

	private Boolean authenticateUser(String un, String pw) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","");   
			  
			Statement stmt=con.createStatement();  
			  
			ResultSet rs=stmt.executeQuery("select * from users where uname='"+un+"' and password='"+pw+"'");  
			
				return rs.next();  
			  
			}catch(Exception e){ 
				System.out.println(e);
				return false;
				}
		
	}
}
