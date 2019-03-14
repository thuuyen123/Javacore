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
            System.out.println("Nhap 1 de Hien Thi Danh Sach theo hoc luc");
            System.out.println("Nhap 5 de Thoat");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    getSinhVienTheoHocLuc();
                    break;
            }

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
}
