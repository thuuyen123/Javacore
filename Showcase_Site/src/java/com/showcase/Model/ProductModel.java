/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.showcase.Model;

import com.showcase.DB.DBconnector;
import com.showcase.Dto.Product;
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
public class ProductModel {
    public List<Product> getAll() throws ClassNotFoundException, SQLException {
        ArrayList<Product> list = new ArrayList<>();
        DBconnector db = new DBconnector();
         Connection conn = db.getConnect();
        String sql = "SELECT * FROM products";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setAuthorId(rs.getInt("author_id"));
            p.setImages(rs.getString("images"));
            p.setActived(rs.getBoolean("actived"));
            p.setCreatedAt(rs.getDate("created_at"));
            p.setUpdatedAt(rs.getDate("updated_at"));
            list.add(p);
        }
        return list;
    }
}
