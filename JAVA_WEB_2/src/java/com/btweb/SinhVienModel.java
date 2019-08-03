package com.btweb;


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
public class SinhVienModel {
    public List<SinhVien> getSinhVien() throws SQLException, ClassNotFoundException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        List<SinhVien> list = new ArrayList<>();
        while(rs.next()){
            SinhVien s = new SinhVien();
            s.setTt(rs.getInt("tt"));
            s.setHoten(rs.getString("hoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
    public void menu(){
        
    }

}
