/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_db_ktratracnghiem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thu Uyên
 */
public class StudentManager {
    Connection conn;
    public StudentManager() throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        this.conn = db.getConnect();
    }
    public Student login(String email, String pass) throws SQLException{
         String query = "SELECT * FROM students WHERE email = ? AND pass = ?";
         PreparedStatement pstmt =this.conn.prepareStatement(query);
         pstmt.setString(1, email);
         pstmt.setString(2, pass);
         ResultSet rs = pstmt.executeQuery();
         Student s = null;
         if(rs.next()){
             s = new Student(rs.getInt("id"),rs.getString("name") ,rs.getString("email"), rs.getString("pass"));
         }
        return s;
    }
    public int addAnswer(Student s, Questions q, String answer) throws SQLException{
        String query = "INSELT INTO student_question VALUE (?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, answer);
        return pstmt.executeUpdate();
    }
    public  void printResult(){
        
    }
}
