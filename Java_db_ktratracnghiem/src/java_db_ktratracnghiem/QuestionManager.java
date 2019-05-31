/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_db_ktratracnghiem;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thu Uyên
 */
public class QuestionManager {
    private Connection conn = null;

    public QuestionManager() throws ClassNotFoundException, SQLException {
        this.conn = new DBconnector().getConnect();
    }
    
    
    public List<Questions> getQuestions() throws ClassNotFoundException,SQLException{
        //1. ket noi db
        
        //2. tao cau truy van query
        String query = "SELECT * FROM questions";
        //3.thuc thi cau lenh truy van
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        //4.duyet ket qua va them vao list
        List<Questions> list = new ArrayList<>();
        while(rs.next()){
            Questions q = new Questions();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswer_a(rs.getString("answer_a"));
            q.setAnswer_b(rs.getString("answer_b"));
            q.setAnswer_c(rs.getString("answer_c"));
            q.setAnswer_d(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            list.add(q);
        }
        return list;
    }
}
