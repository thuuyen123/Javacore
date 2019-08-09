/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.DBconnector;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thu Uyên
 */
public class UserDao {
    public UserDao(){
        
    }
    
    public List<User> getAll() throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "SELECT * FROM student";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        List<User> user = new ArrayList<>();
        while(rs.next()){
            User u = new User();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            user.add(u);
        }
        return user;
    }
    public User getUserById(int id) throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "SELECT * FROM student WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return new User(rs.getInt("id"), rs.getString("name"));
    }
    public void delete(int id) throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "DELETE FROM student where id=?";
        PreparedStatement pstmt = conn.prepareStatement(query); 
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
    }
    public void update(User u) throws SQLException, ClassNotFoundException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "UPDATE student SET name=? WHERE id= ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, u.getName());
        pstmt.setInt(2, u.getId());
        pstmt.executeUpdate();
    }
    public void insert(User u) throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "INSERT INTO student (name) VALUES (?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, u.getName());
        pstmt.executeUpdate();
    }
}
