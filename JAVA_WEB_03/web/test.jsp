<%-- 
    Document   : test
    Created on : Aug 10, 2019, 3:55:50 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="name" value="uyen" scope="page" />
        <c:out value="${name}" />
        
    </body>
</html>
