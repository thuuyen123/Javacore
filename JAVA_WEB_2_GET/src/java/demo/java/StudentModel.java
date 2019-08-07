/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.java;

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
        DBconnector db = new DBconnector();
        Connection conn = db.getConnect();
        String query = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while(rs.next()){
            Student st = new Student();
            st.setId(rs.getInt("id"));
            st.setHoten(rs.getString("hoten"));
            st.setKhoa(rs.getString("khoa"));
            st.setLop(rs.getString("lop"));
            list.add(st);
        }
        return list;
    }
    public Student getStudentById(int id) throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnect();
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
        return s;
    }
    public int addStudent(Student s) throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnect();
        String query = "INSELT INTO sinhvien( `hoten`, `khoa`, `lop`) VALUES(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, s.getHoten());
        pstmt.setString(2, s.getKhoa());
        pstmt.setString(3, s.getLop());
        return pstmt.executeUpdate();
    }
}
