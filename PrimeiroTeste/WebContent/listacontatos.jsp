<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Cliente" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<% ArrayList<Cliente> lista = (ArrayList<Cliente>) session.getAttribute("listaCli"); %>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Lista de Clientes</title>
	</head>
	
	<body>
	
		<% for(Cliente c: lista){ %>
			<%= c.getNome() + "<br />"%>	
		<%}	%>
	
	</body>
</html>