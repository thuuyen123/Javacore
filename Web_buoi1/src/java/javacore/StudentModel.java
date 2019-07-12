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
    private Connection conn = null;
    public StudentModel() throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        this.conn = db.getConnection();
    }
    public List<Student> getStudent() throws SQLException{
        String query = "SELECT * FROM students";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
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
