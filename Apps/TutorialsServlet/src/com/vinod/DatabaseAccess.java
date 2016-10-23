package com.vinod;

//Loading required libraries
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

public class DatabaseAccess extends HttpServlet{
 
public void doGet(HttpServletRequest request,
                 HttpServletResponse response)
         throws ServletException, IOException
{
   // JDBC driver name and database URL
   final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
   final String DB_URL="jdbc:mysql://localhost/TEST";

   //  Database credentials
   final String USER = "root";
   final String PASS = "password";

   // Set response content type
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   String title = "Database Result";
   String docType =
     "<!doctype html public \"-//w3c//dtd html 4.0 " +
      "transitional//en\">\n";
      out.println(docType +
      "<html>\n" +
      "<head><title>" + title + "</title></head>\n" +
      "<body bgcolor=\"#f0f0f0\">\n" +
      "<h1 align=\"center\">" + title + "</h1>\n");
   try{
      // Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      // Open a connection
      Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);

      // Execute SQL query
      Statement stmt = (Statement) conn.createStatement();
      String sql;
      sql = "SELECT id, first, last, age FROM Employees";
      ResultSet rs = stmt.executeQuery(sql);

      // Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         out.println("ID: " + id + "<br>");
         out.println(", Age: " + age + "<br>");
         out.println(", First: " + first + "<br>");
         out.println(", Last: " + last + "<br>");
      }
      out.println("</body></html>");

      // Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }//end try
}
} 