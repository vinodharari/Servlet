<%! 
double test(int i){
	return Math.sqrt(i);
}
%>

<%
double d1=test(100);
double d2=test(200);
double d3=test(300);
%>

<%= d1 %></br>
<%= d2 %></br>
<%= d3 %></br>
<%= test(9000) %></br>
<%= test(9) %></br>
<%= test(9)+test(25) %></br>
