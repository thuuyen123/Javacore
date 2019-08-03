<%-- 
    Document   : homeSinhvien
    Created on : Jul 28, 2019, 3:49:20 PM
    Author     : Thu Uyên
--%>

<%@page import="com.btweb.SinhVien"%>
<%@page import="com.btweb.SinhVienModel"%>
<%@page import="java.util.List"%>
<%--<%@page import="javacore.SinhVien"%>
<%@page import="javacore.StudentModel"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <table  class="table table-dark table-striped">
                <tr>
                    <th>TT</th>
                    <th>Họ tên</th>
                    <th>Khoa</th>
                    <th>Lớp</th>
                    <th>Chức năng</th>
                </tr>
                <%
                    SinhVienModel model = new SinhVienModel();
                    List<SinhVien> sinhvien= model.getSinhVien();
                    for (SinhVien sv : sinhvien) {
                %>
                <tr>
                    <td> <%= sv.getTt() %></td>
                    <td> <%= sv.getHoten() %></td>
                    <td> <%= sv.getKhoa() %></td>
                    <td> <%= sv.getLop() %></td>
                    <td> 
                        <input type="submit" name="sua" value="Sửa" style="background-color: red" />
                        <input type="submit" name="xoa" value="Xóa" style="background-color: blue" />
                    </td>
                </tr>
                <% } %>
            </table>
            <input type="submit" value="Thêm mới" style="background-color: greenyellow" />
        </div>
    </body>
</html>
