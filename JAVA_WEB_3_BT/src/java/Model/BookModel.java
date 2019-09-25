/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DB.DBconnector;
import DTO.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thu Uyên
 */
public class BookModel {
    public List<Book> getAll() throws Exception{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "SELECT * FROM book";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        List<Book> list = new ArrayList<>();
        while(rs.next()){
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setPrice(rs.getString("price"));
            book.setQuantity(rs.getInt("quantity"));
            list.add(book);
        }
        return list;
    }
    public int detete(int id) throws Exception{
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "DELETE FROM book WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    public void update(Book book) throws Exception {
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String query = "UPDATE book SET (name) WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, book.getId());
        pstmt.executeUpdate();
    }
}
