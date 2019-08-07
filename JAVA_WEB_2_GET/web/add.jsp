<%-- 
    Document   : add
    Created on : Aug 5, 2019, 12:17:44 AM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <%@include file="header.jsp" %>
        <form action="addServlet" method="GET">
            <p>Họ Tên</p>
            <input type="text" class="hoten" />
            <p>Khoa</p>
            <input type="text" class="khoa" />
            <p>Lớp</p>
            <input type="text" class="lop" />
            </br>
            <button type="submit" class="btn btn-success"> Thêm </button>
        </form>
    </body>
</html>
