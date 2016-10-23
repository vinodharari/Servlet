<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP Page</title>
</head>
<body>
<h1>Hello All</h1>
<%!
public int add(int a, int b){
	return a+b;
}
%>
<% int i=1;
   int j=2;
   int k=i+j;
   out.println("value of k : "+k);
%>
The value of k is : <%=k%>!!
<%
k=add(15,25);
%>
<br>
<%
	for(i=0; i<5; i++){
		%>
			<br> the value of i is <%=i%>
		<%} %>
	
</body>
</html>