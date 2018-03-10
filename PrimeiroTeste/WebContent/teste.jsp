<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Teste JSP</title>
	</head>
	
	<body>
		
		<%-- Tipo de comentário para JSP. --%>
	<!-- Todo qualquer código Java.-->
	<% %>
	
	<!-- Diretiva, onde "configuramos" o JSP. -->
	<%@ %>
	
	<!-- Declaração de variáveis e instancias -->
	<%! %>
	
	<!-- Expressão. Produzidas saídas pro usuário. -->
	/
	<%= %>
	
		
		<% String str = "Hello World"; %>
		<% out.println(str + "<br />"); %>
		<%= str + "<br />"%>			
		<%
			for(int i = 0; i< 10 ; i++){
				out.println(i + "<br />");
			}
		%>
		<%for(int i = 0; i< 10 ; i++){ %>
			<%= i %>
		<%} %>
		
			
	</body>
</html>