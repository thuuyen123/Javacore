package com.btweb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thu Uyên
 */
public class DBconnector {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String sql = "jdbc:mysql://localhost:3306/DuLieuSinhVien";
        Connection conn = DriverManager.getConnection(sql, "root", "");
        return conn;
    }
}
