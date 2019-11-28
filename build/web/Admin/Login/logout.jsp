<%-- 
    Document   : logout
    Created on : Oct 24, 2015, 12:44:15 PM
    Author     : NIKHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    session.invalidate();
    session = request.getSession();
    response.sendRedirect("index.jsp");
    
    %>
