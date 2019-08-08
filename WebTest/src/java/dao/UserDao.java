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
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author monn
 */
public class UserDao {

    public UserDao() {
       
    }

    
    
    public List<User> getAll() throws Exception{
        DBconnector db = new DBconnector();
        Connection conn = (Connection) db.getConnection();
        String query = "SELECT * FROM student";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<User> user = new ArrayList<>();
        while(rs.next()){
            User u = new User();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            user.add(u);
        }
        return user;
    }

    public User getUserById(int id) throws Exception{
        DBconnector db = new DBconnector();
        Connection conn = (Connection) db.getConnection();
        String query = "SELECT * FROM student where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return new User(rs.getInt("id"),rs.getString("name"));
    }

    public void delete(int id) throws Exception{
        DBconnector db = new DBconnector();
        Connection conn = (Connection) db.getConnection();
        String query = "DELETE FROM student where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        
    }
    
    public void insert(User u) throws Exception{
        DBconnector db = new DBconnector();
        Connection conn = (Connection) db.getConnection();
        String query = "INSERT INTO student (name) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, u.getName());
        ps.executeUpdate();
        
    }
    
    public void update(User u) throws Exception{
        DBconnector db = new DBconnector();
        Connection conn = (Connection) db.getConnection();
        String query = "UPDATE student SET name=? WHERE id= ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, u.getName());
        ps.setInt(2, u.getId());
        ps.executeUpdate();
    }
}
