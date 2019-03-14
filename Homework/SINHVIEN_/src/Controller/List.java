/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.SinhVien;
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
}
