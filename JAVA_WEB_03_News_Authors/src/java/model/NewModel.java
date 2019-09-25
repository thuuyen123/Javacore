/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.DBconnector;
import entity.News;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thu Uyên
 */
public class NewModel {
    public List<News> getAll() throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        List<News> list = new ArrayList<>();
//        String sql = "select news.*, authors.name, authors.email "
//                + "from news join authors on news.author_id = authors.id";
        String sql = "SELECT * FROM news";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        while (rs.next()) {
            News news = new News();
            news.setId(rs.getInt("id"));
            news.setTitle(rs.getString("title"));
            news.setSummary(rs.getString("summary"));
            news.setContent(rs.getString("content"));
            news.setImage(rs.getString("image"));
            news.setAuthor_id(rs.getInt("author_id"));
            list.add(news);
        }
        return list;
    }
    public int update(int id){
        
        return 0;
    }
}
