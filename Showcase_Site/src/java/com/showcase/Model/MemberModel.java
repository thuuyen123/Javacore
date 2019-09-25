/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.showcase.Model;

import com.showcase.DB.DBconnector;
import com.showcase.Dto.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thu Uyên
 */
public class MemberModel {
     public Member login(String email, String password) throws ClassNotFoundException, SQLException {
         DBconnector db = new DBconnector();
         Connection conn = db.getConnect();
        String sql = "SELECT * FROM members WHERE email = ? AND password = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        Member member = null;
        while (rs.next()) {
            member = new Member();
            member.setId(rs.getInt("id"));
            member.setName(rs.getString("name"));
            member.setEmail(rs.getString("email"));
            member.setActived(rs.getBoolean("actived"));
            member.setCreatedAt(rs.getDate("created_at"));
            member.setUpdatedAt(rs.getDate("updated_at"));

        }
        return member;
    }
}
