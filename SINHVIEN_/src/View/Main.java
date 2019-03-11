/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.List;
import Entity.SinhVien;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        List l = new List();
        l.start();
        l.xuatds();
        l.DSSV();
          
    }
}
