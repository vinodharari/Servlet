from test2.jsp </br>
<%=config.getInitParameter("con2") %>

<%!
public void jspInit() {
	System.out.println("from jspInit");
}
%>