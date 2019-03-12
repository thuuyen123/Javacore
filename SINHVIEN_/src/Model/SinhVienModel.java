/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SinhVienModel {
//    ArrayList<SinhVien> sv;
//    public SinhVienModel(){
//        this.sv = new ArrayList<>();
//    }
    private SinhVien[] sinhvien;
    public void DSSV(){
        Scanner sc = new Scanner(System.in);
        int lc;
        System.out.println("Chọn học lực của sinh viên để in ra danh sách");
        do{
            System.out.println("0.Thoat");
            System.out.println("1.Gioi");
            System.out.println("2.Kha");
            System.out.println("3.TB");
            System.out.println("4.Yeu");
            System.out.println("Mời chọn:");
            lc = sc.nextInt();
            switch(lc){
                case 0:{
                    break;
                }
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
            if(lc ==0 ) break;
        }while(lc >0 || lc < 5 );
        
    }
}
