<%-- 
    Document   : add
    Created on : Aug 10, 2019, 11:44:35 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD BOOK</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <%@include file="header.jsp" %>
        <form action="addServlet" method="POST"  >
                <c:if test="${book != null}">
                    <input type="hidden" name="id" value="<c:out value='${book.id}' />" />
                </c:if> 
                <p>Tên sách</p>
                <input type="text" name="title" value="<c:out value='${book.title}' />"/>
                <p>Tên tác giả</p>
                <input type="text" name="author" value="<c:out value='${book.author}' />" />
                <p>Giá</p>
                <input type="text" name="lop" value="<c:out value='${book.price}' />" />
                <p>Số lượng</p>
                <input type="text" name="lop" value="<c:out value='${book.quantity}' />" />
                </br>
                <button href="" class="btn btn-success" type="submit"> Thêm </button>
        </form>
    </body>
</html>
