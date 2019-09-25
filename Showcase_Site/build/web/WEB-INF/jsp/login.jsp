<%-- 
    Document   : login
    Created on : Sep 8, 2019, 3:37:03 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <p style="color: red">${error}</p>
        <spring:form action="auth" modelAttribute="login">
            <spring:label path="email" />
            <spring:input path="email" />
            <br/>
            <spring:label path="password" />
            <spring:password path="password" />
            <br/>
            
            <input type="submit"/>
        </spring:form>
        
        
    </body>
</html>