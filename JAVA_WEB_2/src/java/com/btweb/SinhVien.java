package com.btweb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thu Uyên
 */
public class SinhVien {
    private int tt;
    private String hoten;
    private String khoa;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(int tt, String hoten, String khoa, String lop) {
        this.tt = tt;
        this.hoten = hoten;
        this.khoa = khoa;
        this.lop = lop;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
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
