/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

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
public class StudentModel {
    public List<Student> getStudent() throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String query = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while(rs.next()){
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setHoten("hoten");
            s.setKhoa("khoa");
            s.setLop("lop");
            list.add(s);
        }
        return list;
    }
}
