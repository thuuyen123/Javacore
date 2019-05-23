/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Thu Uyên
 */
public class Process {
    public ResultSet ex6(String bookName, String date) throws Exception{
        DBconnecter dBconnecter = new DBconnecter();
        Connection conn = dBconnecter.getConnect();
        String sql = "SELECT d.ten FROM phieumuon p "
                +"JOIN sach s on s.masach = p.masach " 
                +"JOIN docgia d on d.sothe = p.sothe "
                +"WHERE s.ten = ? AND p.ngaymuon = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, bookName);
        pstmt.setString(2, date);
        return pstmt.executeQuery();
    }
    public ResultSet ex7 (String dateStart, String dateFinish) throws  Exception{
        DBconnecter dBconnecter = new DBconnecter();
        Connection conn = dBconnecter.getConnect();
        String sql = "SELECT docgia.ten AND docgia.sothe AND sach.ten FROM phieumuon " +
                      "JOIN sach on sach.masach = phieumuon.masach " +
                      "JOIN docgia on docgia.sothe = phieumuon.sothe " +
                      "WHERE phieumuon.ngaymuon BETWEEN ? AND ?";
        PreparedStatement pstmt =conn.prepareStatement(sql);
        pstmt.setString(1, dateStart);
        pstmt.setString(2, dateFinish);
        return pstmt.executeQuery();
    }
    public ResultSet ex8 () throws  Exception{
        DBconnecter dBconnecter = new DBconnecter();
        Connection conn = dBconnecter.getConnect();
        String sql = "SELECT sach.* FROM sach " +
                      "WHERE sach.masach NOT IN (SELECT masach FROM phieumuon)";
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }
    public ResultSet ex9(String name) throws Exception{
        DBconnecter dBconnecter = new DBconnecter();
        Connection conn = dBconnecter.getConnect();
        String sql = "SELECT COUNT(*) AS 'soluong' FROM phieumuon "
                     + "JOIN docgia on docgia.sothe = phieumuon.sothe "
                     + " WHERE docgia.ten = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        return pstmt.executeQuery();
    }
    public ResultSet ex10() throws Exception{
        DBconnecter dBconnecter = new DBconnecter();
        Connection conn = dBconnecter.getConnect();
        String sql = "SELECT docgia.sothe, docgia.sothe FROM phieumuon" +
                    "JOIN docgia ON docgia.sothe = phieumuon.sothe" +
                    " WHERE phieumuon.ngaytra = null;";
       Statement stmt = conn.createStatement();
       return stmt.executeQuery(sql);
    }
}
