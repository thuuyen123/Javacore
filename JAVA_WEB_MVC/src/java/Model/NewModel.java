/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DB.DBConnector;
import DTO.News;
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
public class NewModel {
    public List<News> getAll() throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn = db.geConnection();
        String query = "SELECT * FROM news";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(); 
        List<News> list = new ArrayList<>();
        while(rs.next()){
            News news = new News();
            news.setId(rs.getInt("id"));
            news.setTitle(rs.getString("title"));
            news.setSummary(rs.getString("summary"));
            news.setContent(rs.getString("content"));
            news.setCreatAt(rs.getDate("create_at"));
            news.setAuthorId(rs.getInt("author_id"));
            list.add(news);
        }
        return list;
    }
    public News getById(int id) throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn = db.geConnection();
        String query = "SELECT * FROM news WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        News news = new News();
        news.setId(rs.getInt("id"));
        news.setTitle(rs.getString("title"));
        news.setSummary(rs.getString("summary"));
        news.setContent(rs.getString("content"));
        news.setCreatAt(rs.getDate("create_at"));
        news.setAuthorId(rs.getInt("author_id"));
        return news;
        
    }
   public int addNews(News news) throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn = db.geConnection();
        String query = "INSELT INTO news(title, summary, content, create_at, author_id) VALUSE(?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, news.getTitle());
        pstmt.setString(2, news.getSummary());
        pstmt.setString(3, news.getContent());
        pstmt.setDate(4, news.getCreatAt());
        pstmt.setInt(5, news.getAuthorId());
        return pstmt.executeUpdate();
   }
   public int update(News news) throws ClassNotFoundException, SQLException{
         DBConnector db = new DBConnector();
        Connection conn = db.geConnection();
        String query = "UPDATE news SET title = ? WHERE id = ? ";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, news.getTitle());
        pstmt.setInt(2, news.getId());
        return pstmt.executeUpdate();
   }
   public int delete(int id) throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn = db.geConnection(); 
        String query = "DELETE FROM news(name) VALUES(?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id );
        return pstmt.executeUpdate();
   }
}
