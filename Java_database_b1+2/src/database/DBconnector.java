/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Thu Uyên
 */
public class DBconnector {

    public Connection getConnect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/QUANLYTHUVIEN";
        Connection conn = DriverManager.getConnection(conStr, "root", "");
        return conn;
    }
}


