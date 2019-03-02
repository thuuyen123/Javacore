/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttaptech;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class HocVien {
    private String ten;
    private String maHV;
    private String nganh;
    private String lop;

    public HocVien() {
    }

    public HocVien(String ten, String maHV, String nganh, String lop) {
        this.ten = ten;
        this.maHV = maHV;
        this.nganh = nganh;
        this.lop = lop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học viên");
        ten = sc.nextLine();
        System.out.println("Nhập mã học viên");
        maHV = sc.nextLine();
        System.out.println("Nhập ngành học");
        nganh = sc.nextLine();
        System.out.println("Nhập lớp của học viên");
        lop = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Tên học viên"+ getTen());
        System.out.println("Mã học viên"+ getMaHV());
        System.out.println("Ngành học"+ getNganh());
        System.out.println("Lớp của học viên"+ getLop());
    }
 
}
