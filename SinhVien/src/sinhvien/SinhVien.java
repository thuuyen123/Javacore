/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
//Ứng dụng có chức năng:
//1. Nhập 1 danh sách sinh viên
//2. Hiển thị danh sách sinh viên theo học lực
//3. Bắt ngoại lệ Nhập sai
//---Ví dụ Nhập điểm là số nhưng người dùng nhập vào chữ
//---Nhập sai đinh dạng ví dụ nhập HVxxx người dùng nhập VVxxx thì phải yêu câu nhập lại
public class SinhVien {
    private String ten;
    private String maSV;
    private String lop;
    private String Nganh;
    private float diemTB;
    

    public SinhVien() {
    }

    public SinhVien(String ten, String maSV, String lop, String Nganh, float diemTB) {
        this.ten = ten;
        this.maSV = maSV;
        this.lop = lop;
        this.Nganh = Nganh;
        this.diemTB = diemTB;
        
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
     //   do{
            try{
                ten = sc.nextLine();
            }catch(Exception e){
                System.out.println("Đã xảy ra lỗi");
            }
   //     }while(ten.)
        
        System.out.println("Nhập mã sinh viên");
        maSV = sc.nextLine();
        System.out.println("Nhập lớp");
        lop = sc.nextLine();
        System.out.println("Nhập ngành học");
        Nganh = sc.nextLine();
        System.out.println("Nhập điểm trung bình của sinh viên ");
        diemTB = sc.nextFloat();
    }
    public void xuat(){
        System.out.println("Tên SV: "+ ten);
        System.out.println("Mã SV: "+ maSV);
        System.out.println("Lớp SV: "+ lop);
        System.out.println("Ngành học: "+ Nganh);
        System.out.println("Điểm trung bình của SV: "+ diemTB);
    }
    public String hocLuc(){
        //String hocluc = "";
        if(diemTB >= 8 && diemTB <=10) return "Gioi";
        if(diemTB < 8 && diemTB >=6.5 ) return "Kha";
        if(diemTB <6.5 && diemTB >=4) return "TB";
        if(diemTB<4 &&diemTB >= 0) return "Yeu";
        return "";
    }
}
//1 2 3 
//4 5 6
//7 8 9