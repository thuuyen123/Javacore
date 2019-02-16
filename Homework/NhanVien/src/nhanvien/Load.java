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
public class Load {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng Nhân Viên");
        int n;
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        NhanVien array[] = new NhanVien[n];//new lần 1
        for (int i = 0; i < array.length; i++) {
           array[i] = new NhanVien();
           array[i].inputInfo();
        }
        for (int i = 0; i < array.length; i++) {
            NhanVien nhanVien = array[i];
            nhanVien.printInfo();
        }
    }
}
