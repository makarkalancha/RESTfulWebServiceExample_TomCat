<%@ page import="java.util.List" %>
<html>
	<body>
		Result:
		<%
		List<String> styles = (List<String>) request.getAttribute("styles"); 
		for(String style : styles){
			%>
			<h1><%=style %></h1>
			<%
		}
		%>
	</body>
</html>