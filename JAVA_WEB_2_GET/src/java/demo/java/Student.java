/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.java;

/**
 *
 * @author Thu Uyên
 */
public class Student {
    private int id; 
    private String hoten; 
    private String khoa; 
    private String lop; 

    public Student() {
    }

    public Student(String hoten, String khoa, String lop) {
        this.hoten = hoten;
        this.khoa = khoa;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
}
