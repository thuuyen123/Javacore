/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ListController;
import Entity.SinhVien;
import Model.SinhVienModel;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        List l = new List();
//        SinhVienModel md = new SinhVienModel();
//        l.start();
//        l.xuatds();
//        md.DSSV();
        ListController a = new ListController();
        a.nhapThongTin();
        a.hienThiMenu();
        
          
    }
}
