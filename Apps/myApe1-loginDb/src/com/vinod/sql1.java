package com.vinod;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class sql1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/students","root","");  
  
//here sonoo is database name, root is username and password  
  
Statement stmt=con.createStatement();  
  
ResultSet rs=stmt.executeQuery("select * from stmarks");  
  
while(rs.next())  
System.out.println(rs.getString(2));  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  