/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.SinhVien;
import Model.SinhVienModel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class ListController {

    Scanner sc = new Scanner(System.in);
    SinhVienModel sinhVienModel = new SinhVienModel();
    int n;

    public void nhapThongTin() {
        System.out.println("Nhập số lượng sinh viên:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            if (sinhVienModel.getFullSizeArray() > sinhVienModel.getCount()) {
                sv.Nhap();
                sinhVienModel.addSinhVien(sv);
            } else {
                break;
            }
        }
    }

    public void hienThiMenu() {
        int choice = 0;
        while (choice != 5) {
            System.out.println("1.Hiển thị danh sách theo học lực");
            System.out.println("2.Hiện thị tên vừa tìm kiếm");
            System.out.println("3.Thêm sinh viên vào danh sách");
            System.out.println("4.Hiển thị danh sách sinh viên");
            System.out.println("5.Thoát");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    getSinhVienTheoHocLuc();
                    break;
                case 2:
                    getSearch();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    HTDS();
                    break;
            }

        }
    }
    public void add(){
        System.out.println("Nhập số lượng sinh viên cần thêm: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
           SinhVien sv = new SinhVien();
            if (sinhVienModel.getFullSizeArray() > sinhVienModel.getCount()) {
                sv.Nhap();
                sinhVienModel.addSinhVien(sv);
            } else {
                break;
            }
        }
    }
    public void HTDS(){
        ArrayList<SinhVien> list = sinhVienModel.hienthiDS();
        for (SinhVien sv: list) {
            sv.xuat();
        }
    }
    public void getSinhVienTheoHocLuc() {
        int lc;
        System.out.println("Chọn học lực của sinh viên để in ra danh sách(gioi,kha,tb):");
        String hocLuc = sc.nextLine();
        ArrayList<SinhVien> list = sinhVienModel.getSinhVienByHocLuc(hocLuc);
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }
    public void getSearch(){
        System.out.println("Nhập tên sinh viên cần tìm kiếm: ");
        String name = sc.nextLine();
        ArrayList<SinhVien> list = sinhVienModel.searchName(name);
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }
}
