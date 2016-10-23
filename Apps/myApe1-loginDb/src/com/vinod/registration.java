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

public class registration extends HttpServlet {
	public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException, IOException{
		String un = r1.getParameter("uname");
		String pw = r1.getParameter("password");
		String data[] = {un, pw};
		int insertionStatus = registerNewUser(data);
		PrintWriter out=r2.getWriter();
		
		if(insertionStatus==1){
			out.println("Registartion Success");
		}
		else{
			out.println("Registarion Failed");
		}
		out.close();
	}
	

	   private int registerNewUser(String[] data) {
		String sql=null;
		sql="insert into users(uname,password) values('"+data[0]+"','"+data[1]+"')";
		System.out.println(sql);
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","");   
			  
			Statement stmt=con.createStatement();  
			  
			return stmt.executeUpdate(sql.toString());  
			
			}catch(Exception e){ 
				System.out.println(e);
				return 0;
				}
		}
}
