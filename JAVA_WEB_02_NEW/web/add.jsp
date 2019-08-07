<%-- 
    Document   : add.jsp
    Created on : Aug 2, 2019, 10:56:04 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        
        <%@include file="header.jsp" %>
        <form action="addServlet" method="POST"  >
                <c:if test="${student != null}">
                    <input type="hidden" name="id" value="<c:out value='${student.id}' />" />
                </c:if> 
                <p>Họ tên</p>
                <input type="text" name="hoten" value="<c:out value='${student.hoten}' />"/>
                <p>Khoa</p>
                <input type="text" name="khoa" value="<c:out value='${student.khoa}' />" />
                <p>Lớp</p>
                <input type="text" name="lop" value="<c:out value='${student.lop}' />" />
                </br>
                <button href="" class="btn btn-success" type="submit"> Thêm </button>
        </form>
    </body>
</html>
