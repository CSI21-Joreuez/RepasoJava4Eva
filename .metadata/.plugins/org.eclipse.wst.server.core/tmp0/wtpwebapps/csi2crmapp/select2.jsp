<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="mipk.beanDB"%>
<html><head>
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <style>
    body {
        padding-top: 70px;
        /* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
    }
    </style>


</head><body>
<%
String grprecibido="";
grprecibido=request.getParameter("valorgrp");
if(grprecibido==null)
	grprecibido="%";
String query="select a.nombre, apellidos from alumnos a join grupos on (a.idGrupo=grupos.idGrupo)";
query += " where a.idGrupo like '" + grprecibido + "'";
System.out.println(query);
beanDB basededatos = new beanDB();
String [][] tablares = basededatos.resConsultaSelectA3(query);
%> 
<table>
<% for (int i=0; i<tablares.length;i++) {
	%><tr> <%
	for (int j=0; j<tablares[i].length;j++) {
	%> <td> <%=tablares[i][j] %> </td> <%
	}
	%> </tr> <%
}
%>
</table>
</body></html>