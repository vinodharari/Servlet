<%@ page import="java.util.*" %>

<html>
<body>
	<% // get the list of advise from request
	List<String> listOfAdvices = (List<String>)request.getAttribute("advise"); 
	
	/**
	 * get the iterator
	 */
	Iterator<String> iter = listOfAdvices.iterator();
	String str = null;
	
	while(iter.hasNext()) {
		
		/**
		 * get the advise
		 */
		str = iter.next();
		
		out.println("<br>try: "+str);
	}
	
	%>
</body>
</html>