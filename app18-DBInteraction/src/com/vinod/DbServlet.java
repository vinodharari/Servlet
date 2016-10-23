package com.vinod;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbServlet
 */
public class DbServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException {
		String s1=r1.getParameter("firstName");
		String s2=r1.getParameter("lastName");
		String sql="insert into users values('"+s1+"','"+s2+"')";
		PrintWriter out=r2.getWriter();
		out.println("sql : "+sql);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con=null;
		Statement stmt=null;
		int i=0;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","");
			stmt=con.createStatement();
			i=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		PrintWriter out1=r2.getWriter();
		r2.setContentType("text/html");
		if(i==1){
			out1.println("DB Operartion is success");
		}
		else {
			out1.println("DB Operation is failed");
		}
	}
}
