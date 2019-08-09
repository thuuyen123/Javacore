<%-- 
    Document   : list
    Created on : Aug 9, 2019, 11:24:51 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books store app</title>
    </head>
    <body>
        <center>
            <h1>Books Management</h1>
            <h2>
                <a href="add"> Add new User</a>
                 &nbsp;&nbsp;&nbsp;
                <a href="list">List All User</a>
            </h2>
        </center>
        <div align="center">
            <table border="1" cellpadding="5">
                <caption><h2>List of Books</h2></caption>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
                <c:forEach var="user" items="${listUser}">
                    <tr>
                        <td><c:out value="${user.id}" /></td>
                        <td><c:out value="${user.name}" /></td>
                        <td>
                            <a href="edit?id=<c:out value='${user.id}' />">Edit</a>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="delete?id=<c:out value='${user.id}' />">Delete</a>                     
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
