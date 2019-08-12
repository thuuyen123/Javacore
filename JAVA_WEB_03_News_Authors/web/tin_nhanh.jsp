<%-- 
    Document   : tin_nhanh
    Created on : Aug 11, 2019, 3:49:47 PM
    Author     : Thu Uyên
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tin nhanh</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    </head>
    <body>
        <nav class="navbar navbar-dark bg-primary">
            Tin nhanh
        </nav>
        <div class="container">
            <div class="row">
                <form class="" method="POST" action="search">
                    <div>
                        <label>Search</label>
                        <input type="text" name="keyword" class="form-control" >
                        <button type="submit" class="btn btn-primary" hrep="">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
