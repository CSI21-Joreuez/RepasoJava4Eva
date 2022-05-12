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
String query="select nombre from Asignaturas";
beanDB basededatos = new beanDB();
String [][] tablares = basededatos.resConsultaSelectA3(query);
%>
<FORM name="introgrupo" ACTION="select.jsp" method="GET"> 
<SELECT name="valorgrp" onchange="submit();">
<option value="">Elija un Curso...</option>
<% for (int i=0; i<tablares.length;i++) {
	%><option value="<%=tablares[i][0]%>"><%=tablares[i][0]%>
	<%=tablares[i][1]%></option>
<%  } %>
</SELECT></FORM>
<%
String grprecibido="";
try {	grprecibido=request.getParameter("valorgrp").toString(); } 
catch (Exception e) {}

//String query2="select a.nombre, a.apellidos from Alumnos a join Respuestas on (id_Alumno=alumno_id) join Challeng ON (challeng_id = id_challeng) JOIN Asignaturas ON (asignatura_id = id_Asignatura) ";
//query2 += " where a.idGrupo like '" + grprecibido + "'";
String query2="select a.nombre, a.apellidos from Alumnos";
String [][] tablares2 = basededatos.resConsultaSelectA3(query2);
%> 
<table>
<% if (tablares2!=null) {
%><h2>Alumnos del curso <%=grprecibido%></h2><%
for (int i=0; i<tablares2.length;i++) {
	%><tr> <%
	for (int j=0; j<tablares2[i].length;j++) {
	%> <td> <%=tablares2[i][j] %> </td> <%
	}
	%> </tr> <%
} 
}
%>
</table>
</body></html>