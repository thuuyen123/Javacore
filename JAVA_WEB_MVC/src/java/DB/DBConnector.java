/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thu Uyên
 */
public class DBConnector {
   public Connection geConnection() throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       String sql = "jdbc:msql://localhost:3308/news_authors";
       Connection conn = DriverManager.getConnection(sql, "root", "");
       return conn;
   }
}
