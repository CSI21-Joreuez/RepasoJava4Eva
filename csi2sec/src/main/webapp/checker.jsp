<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    boolean esOK=true;
try {
	String aux=session.getAttribute("usuario").toString();
} catch (Exception e) {
	esOK=false;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% if(esOK){%>
 <h1>Hola Bienvenido</h1>
 <%} else{%>
 <h1>No eres Bienvenido Aqu�</h1>
<% }%>
</body>
</html>