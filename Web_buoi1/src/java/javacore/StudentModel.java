package javacore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thu Uyên
 */
public class StudentModel {
 
    public List<Student> getStudent() throws SQLException, ClassNotFoundException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "SELECT * FROM students";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while(rs.next()){
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setPass(rs.getString("pass"));
            list.add(s);
        }
        return list;
    }
}
