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

    public List<Student> getStudent() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnections();
        String query = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setHoten(rs.getString("hoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }

    public Student getStudentById(int id) throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnections();
        String query = "SELECT * FROM sinhvien where id=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        Student s = new Student();
        s.setId(rs.getInt("id"));
        s.setHoten(rs.getString("hoten"));
        s.setKhoa(rs.getString("khoa"));
        s.setLop(rs.getString("lop"));
//        int rs =  pstmt.executeUpdate();
        return s;
    }

    public int addStudent(Student st) throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnections();
        String query = "INSERT INTO sinhvien( `hoten`, `khoa`, `lop`) VALUES (?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, st.getHoten());
        pstmt.setString(2, st.getKhoa());
        pstmt.setString(3, st.getLop());
        return pstmt.executeUpdate();
    }
}
