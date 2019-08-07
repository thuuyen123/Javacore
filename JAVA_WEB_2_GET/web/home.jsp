<%-- 
    Document   : home
    Created on : Aug 5, 2019, 12:17:15 AM
    Author     : Thu Uyên
--%>

<%@page import="demo.java.Student"%>
<%@page import="java.util.List"%>
<%@page import="demo.java.StudentModel"%>
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
        </br>
        <div class="container">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th>#</th>
                        <th>Họ Tên</th>
                        <th>Khoa</th>
                        <th>Lớp</th>
                        <th>Chức năng</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        StudentModel model = new StudentModel();
                        List<Student> list = model.getStudent();
                        for (Student student : list) {
                    %>  
                    <tr>
                        <td> <%= student.getId() %></td>
                        <td> <%= student.getHoten() %></td>
                        <td> <%= student.getKhoa() %></td>
                        <td> <%= student.getLop() %></td>
                        <td>
                        <a class="btn btn-primary" href=""> Xóa</a>
                        <a class="btn btn-danger" href="">Sửa</a>
                        </td>
                    </tr>
                    <%
                            }
                    %>
                </tbody>
                
            </table>
                <a class="btn btn-success" href="add.jsp">Thêm mới </a>
        </div>
    </body>
</html>
