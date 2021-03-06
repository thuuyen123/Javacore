<%-- 
    Document   : home
    Created on : Aug 4, 2019, 3:42:06 PM
    Author     : Thu Uyên
--%>

<%@page import="com.java.demo.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.java.demo.StudentModel"%>
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
                        <th>Họ tên</th>
                        <th>Khoa</th>
                        <th>Lớp</th>
                        <th>Chức năng</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                    StudentModel model = new StudentModel();
                    List<Student> list = model.getStudent();
                    for (Student st : list) {
                    %>
                    <tr>
                        <td><%= st.getId() %></td>
                        <td><%= st.getHoten() %></td>
                        <td><%= st.getKhoa() %></td>
                        <td><%= st.getLop() %></td>
                        <td>
                            <a class='btn btn-primary' hrep="addServlet?id=<%= st.getId() %>"> Sửa</a>
                            <a class='btn btn-danger' href="">Xóa</a>
                        </td>
                    </tr>
                    <%   }
                        %>
                </tbody>
            </table>
            <a class="btn btn-success" href="add.jsp"> Thêm mới</a>
        </div>
       
    </body>
</html>
