/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_data1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {// arl +enter
            Class.forName("com.mysql.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/QUANLYTHUVIEN";
            Connection conn = DriverManager.getConnection(connStr, "root","");
            if(conn != null){
                System.out.println("Ket noi thanh cong");
                System.out.println("-----------------------");
                //sau khi ket nối thành công
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM DOCGIA ORDER BY KHOA ASC");
                while(rs.next()){
                    System.out.print(rs.getString("ten")+", ");
                    System.out.println(rs.getString("khoa"));
                }
            }
            else {
                System.out.println("ket noi that bai");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
