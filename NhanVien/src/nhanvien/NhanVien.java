/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diac;
    private double tien;
    private int gio;
    
    public NhanVien(){
        ten = "";
        tuoi = 0;
        diac = "";
        tien = 0;
        gio = 0;
    }//hàm khởi tạo ko tham số

    public NhanVien(String ten, int tuoi, String diac, double tien, int gio) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diac = diac;
        this.tien = tien;
        this.gio = gio;
    }
    
    
    public String getTen(){
        return ten;
    }
    public int getTuoi(){
        return tuoi;
    }
    public String getDiac(){
        return diac;
    }
    public double getTien(){
        return tien;
    }
    public int getGio(){
        return gio;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public void setDiac(String diac){
        this.diac = diac;
    }
    public void setTien(double tien){
        this.tien = tien;
    }
    public void setGio(int gio){
        this.gio = gio;
    }    
    
    public void inputInfo(){//(NhanVien x){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten nhan vien: ");
        //cach 1: ten = sc.nextLine();
        setTen(sc.nextLine());//cách 2
        //x.setTen(ten);
        System.out.print("nhap tuoi nv: ");
        tuoi = sc.nextInt();//2 enter
        sc.nextLine();
        //x.setTuoi(tuoi);
        System.out.print("nhap dia chi nv: ");
        diac = sc.nextLine();//lấy đến khi gặp enter
        //x.setDiac(diac);
        System.out.print("nhap tien luong: ");
        tien = sc.nextDouble();
        //x.setTien(tien);
        System.out.print("nhap tong so gio lam: ");
        gio = sc.nextInt();
        //x.setGio(gio);
  
    }
          
    public void printInfo(){
        System.out.println("Thong tin cua nhan vien");
        System.out.println("Ten nhan vien" + getTen());
        System.out.println("Tuoi nhan vien" + getTuoi());
        System.out.println("Dia chi cua nhan vien" + getDiac());
        System.out.println("Tien luong nhan vien" + getTien());    
        System.out.println("Tong so gio lam cua nhan vien" + getGio());
        System.out.println("Tiền thưởng: "+tinhThuong());
    }
        
  
    public double tinhThuong(){
        double thuong =0;
        if( getGio() >= 200 ) thuong= getTien()*20/100;
        else if(getGio() < 200 && getGio()>=100) thuong = getTien()*10/100;
        else if(getGio()<100) thuong=0;
        
        return thuong;
    }
    
}
