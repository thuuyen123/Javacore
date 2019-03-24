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
    private SinhVien[] sinhViens = new SinhVien[10];
    private int count = 0;
    public SinhVienModel(){
//        this.sv = new ArrayList<>();
    }
    public int getFullSizeArray(){
        return sinhViens.length;
    }
    public boolean addSinhVien(SinhVien sv){
        try {
            sinhViens[count] = sv;
            count++;
        } catch (Exception e) {
            return false;
        }finally{
            return true;
        }
    }
    
//    private SinhVien[] sinhvien;
//    public void DSSV(){
//        Scanner sc = new Scanner(System.in);
//        int lc;
//        System.out.println("Chọn học lực của sinh viên để in ra danh sách");
//        do{
//            System.out.println("0.Thoat");
//            System.out.println("1.Gioi");
//            System.out.println("2.Kha");
//            System.out.println("3.TB");
//            System.out.println("4.Yeu");
//            System.out.println("Mời chọn:");
//            lc = sc.nextInt();
//            switch(lc){
//                case 0:{
//                    break;
//                }
//                case 1:{
//                    for (int i = 0; i < sinhvien.length; i++) {
//                        if(sinhvien[i].hocLuc() == "Gioi" )
//                            sinhvien[i].xuat();
//                    }
//                    break;
//                }
//                case 2:{
//                    for (int i = 0; i < sinhvien.length; i++) {
//                        if(sinhvien[i].hocLuc() == "Kha" )
//                            sinhvien[i].xuat();
//                    }
//                    break;
//                }
//                case 3:{
//                    for (int i = 0; i < sinhvien.length; i++) {
//                        if(sinhvien[i].hocLuc() == "TB" )
//                            sinhvien[i].xuat();
//                    }
//                    break;
//                }
//                case 4:{
//                    for (int i = 0; i < sinhvien.length; i++) {
//                        if(sinhvien[i].hocLuc() == "Yeu" )
//                            sinhvien[i].xuat();
//                    }
//                    break;
//                }
//            }
//            if(lc ==0 ) break;
//        }while(lc >0 || lc < 5 );
        
//    }
    public ArrayList<SinhVien> getSinhVienByHocLuc(String hocLuc){
        ArrayList<SinhVien> sv = new ArrayList<>();
        int DiemDau =0;
        int DiemCuoi = 6;
        if(hocLuc.equals("gioi")){
            DiemDau = 8;
            DiemCuoi = 11;
        }else if(hocLuc.equals("kha")){
            DiemDau = 6;
            DiemCuoi =8;
        }
        for (int i = 0; i < count; i++) {
            if(sinhViens[i].getDiemTB() >= DiemDau && sinhViens[i].getDiemTB() < DiemCuoi) {
                sv.add(sinhViens[i]);
            }
        }
        return sv;
    }
    public ArrayList<SinhVien> searchName(String name){
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < count; i++) {
           if(sinhViens[i].getTen().equals(name) ){
                sv.add(sinhViens[i]);
            }
        } 
        return sv;
    }
    public ArrayList<SinhVien> hienthiDS(){
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            sv.add(sinhViens[i]);
            
        }
        return sv;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
