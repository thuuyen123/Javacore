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
public class List {
    private SinhVien[] sinhvien;
    
    public void start(){
      //  SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên:");
        int n = sc.nextInt();
       
        this.sinhvien = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sinhvien[i] = new SinhVien();
            sinhvien[i].Nhap();
        }
    }
    public void xuatds(){
        for (int i = 0; i < sinhvien.length; i++) {
            sinhvien[i].xuat();
        }
    }
    public void DSSV(){
        Scanner sc = new Scanner(System.in);
        int lc;
        System.out.println("Chọn học lực của sinh viên để in ra danh sách");
        do{
            System.out.println("1.Gioi");
            System.out.println("2.Kha");
            System.out.println("3.TB");
            System.out.println("4.Yeu");
            System.out.println("Mời chọn:");
            lc = sc.nextInt();
            switch(lc){
                case 1:{
                    for (int i = 0; i < sinhvien.length; i++) {
                        if(sinhvien[i].hocLuc() == "Gioi" )
                            sinhvien[i].xuat();
                    }
                    break;
                }
                case 2:{
                    for (int i = 0; i < sinhvien.length; i++) {
                        if(sinhvien[i].hocLuc() == "Kha" )
                            sinhvien[i].xuat();
                    }
                    break;
                }
                case 3:{
                    for (int i = 0; i < sinhvien.length; i++) {
                        if(sinhvien[i].hocLuc() == "TB" )
                            sinhvien[i].xuat();
                    }
                    break;
                }
                case 4:{
                    for (int i = 0; i < sinhvien.length; i++) {
                        if(sinhvien[i].hocLuc() == "Yeu" )
                            sinhvien[i].xuat();
                    }
                    break;
                }
            }
        }while(lc>0 && lc < 5 );
        
    }
    
}
