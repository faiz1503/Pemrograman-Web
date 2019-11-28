<%-- 
    Document   : Coba2
    Created on : Jul 13, 2018, 10:55:59 AM
    Author     : DeysiFortuna
--%>
<%@page import="Model.MemberHome"%>
<%@page language="java"%>
<%@page import="Model.Member"%>
<%
    String nomor = request.getParameter("nomor");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=nomor%></h1>
    </body>
</html>
