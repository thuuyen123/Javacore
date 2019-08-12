<%-- 
    Document   : index
    Created on : Aug 10, 2019, 3:32:02 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% String name = "sdsds"; %>
        <c:set var="name" value="uyen" scope="page" />
        <c:remove var="name" scope="page" />
        <%--<c:out value="${name}" />--%>
        <hr/>
        <c:set var="age" value="${19}" scope="page" />
        <c:if test="${age>18}">
            <h1>Welcome ${name}</h1>
        </c:if>
            <c:choose>
                <c:when test="${age <=18}">
                    <h1>Ko hop le</h1>
                </c:when>
                <c:when test="${age>18 && age<90}">
                    <h2>Welcome</h2>
                </c:when>
                <c:otherwise>
                    <h1>qua tuoi</h1>
                </c:otherwise>
            </c:choose>
            <hr/>
            <ul>
                <c:forEach var="i" begin="0" end="10" step="1">
                    <li>Item ${i}</li>
                </c:forEach>
            </ul>
            <sql:setDataSource 
                var="conn" 
                driver="com.mysql.jdbc.Driver" 
                user="root"
                password=""
                url="jdbc:mysql://localhost:3306/web_jsp_servlet"/>
            <%--<sql:update var="itemrs" sql="UPDATE student SET " />--%>
             <sql:update var="rs" dataSource="${conn}" sql="INSERT INTO student( name) VALUES(?)" >
                <sql:param value="Mai" />
             </sql:update>    
            <sql:query dataSource="${conn}" var="rs"
                       sql="SELECT * FROM student" />
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
                <c:forEach var="item" items="${rs.rows}" >
                    <tr>
                        <td><c:out  value="${item.id}"/></td>
                        <td><c:out value="${item.name}" /> </td>
                    </tr>
                </c:forEach>
               
            </table>
           
           
    </body>
</html>
