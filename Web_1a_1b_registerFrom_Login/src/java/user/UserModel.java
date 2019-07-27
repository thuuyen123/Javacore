/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thu Uyên
 */
public class UserModel {
    public int insert(User user) throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String sql = "INSERT INTO user(username, password,fullname, email,address)"+ ""
                + "VALUE (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getFullname());
        pstmt.setString(4 , user.getEmail());
        pstmt.setString(5, user.getAddress());
        
        return pstmt.executeUpdate();
    }
    public int delete(User user) throws ClassNotFoundException, SQLException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String sql = "DELETE FROM user WHERE username=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        return pstmt.executeUpdate();
    }
    public ResultSet check(User user) throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "SELECT *FROM user WHERE username=? AND password=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2,user.getPassword());
        return pstmt.executeQuery();
    }
}
