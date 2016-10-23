<%
int[] x={10,30,20,50};
String s1=java.util.Arrays.toString(x);
java.util.Date d1=new java.util.Date(0);
int i=10;
i++;
i+=20;
%>
<%= "array content : "+java.util.Arrays.toString(x) %></br>
<%= "array content : "+s1 %></br>
<%= "base date : "+d1 %></br>
<%= "i value : "+i %></br>