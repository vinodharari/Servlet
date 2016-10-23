i am from test18.jsp </br>
<jsp:include page="test19.jsp" >
<jsp:param name="param1" value="abc" />
<jsp:param name="param2" value="xyz" />
</jsp:include>
i am from end of test18.jsp</br>
Param1: <%=request.getParameter("param1") %></br>
Param2: <%=request.getParameter("param2") %></br>