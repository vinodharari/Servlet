<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>objects</title>
</head>
<body>

<%
String userName=request.getParameter("name");
pageContext.setAttribute("pageContextUserName", userName);
if (userName != null) {
	session.setAttribute("sessionUserName", userName);
	//application.setAttribute("applicationUserName",userName);
	pageContext.setAttribute("pageContextUserName", userName);
	pageContext.setAttribute("applicationUserName", userName, pageContext.APPLICATION_SCOPE);
	pageContext.findAttribute("name");
}
%>
<br>
the name in request object is: <%=userName%>;
<br>
the name in session object is: <%=session.getAttribute("sessionUserName") %>
<br>
the name in application object is: <%=application.getAttribute("applicationUserName") %>
<br>
the name in page object is: <%=pageContext.getAttribute("pageContextUserName")%>
</body>
</html>