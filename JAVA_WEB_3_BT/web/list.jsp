<%-- 
    Document   : list
    Created on : Aug 10, 2019, 11:45:19 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Manager</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <%@include file="header.jsp" %>
    </head>
    <body>
        
        <table class="table table-striped">
            <tr>
                <th>#</th>
                <th>Tên sách</th>
                <th>Tác giả</th>
                <th>Giá</th>
                <th>Số.lg</th>
                <th>Chức năng</th>
            </tr>
            <c:forEach var="item" items="${list}" >
                <tr>
                    <td>${item.id}</td>
                    <td>${item.title}</td>
                    <td>${item.author}</td>
                    <td>${item.price}</td>
                    <td>${item.quantity}</td>
                    <td>
                        <a href="update?id=<c:out value='${item.id}' />" type="submit" class="btn btn-primary" >Sửa</a>
                        <a type="submit " class="btn btn-danger" href="delete?id=<c:out value='${item.id}' />" > Xóa</a>         
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="add" type="submit" class="btn btn-success" >Thêm mới</a>
    </body>
</html>
