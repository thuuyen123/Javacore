<%-- 
    Document   : students_jsp
    Created on : Jul 27, 2019, 4:36:13 PM
    Author     : Thu Uyên
--%>

<%@page import="java.util.List"%>
<%@page import="javacore.Student"%>
<%@page import="javacore.StudentModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Danh sách sinh viên</h1>
            <table >
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Pass</th>
                </tr>
                <% StudentModel model = new StudentModel();
                    List<Student> students = model.getStudent();
                   for (Student stud : students) { %>
                   <tr>
                       <td> <%= stud.getId() %> </td>
                       <td> <%= stud.getName() %> </td>
                       <td> <%= stud.getEmail() %> </td>
                       <td> <%= stud.getPass() %> </td>
                   </tr>   
                   <% } %>
            </table>
        </div>
    </body>
</html>
