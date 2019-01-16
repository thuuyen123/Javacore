/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapslide7;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {

    public static void main(String[] args) {
        Store s = new Store();
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("===========MENU============");
            System.out.println("1.Add Product");
            System.out.println("2.List Product");
            System.out.println("3.Seach");
            System.out.println("4.Exit");
            System.out.println("Ban chon: ");
            //    System("cls");
            lc = sc.nextInt();
            switch (lc) {
                case 1: {
                    s.start();
                    break;
                }
                case 2: {
                    s.prinInfo();
                    break;
                }
                case 3: {
                    System.out.println("Nhap ten ban muon tim kiem: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    s.search(ten);
                    break;
                }
                case 4:// em vẫn ko biết muốn thoát hẳn ra khỏi chương trình thì làm thế nào!
                    break;
            }
        if(lc ==4) break;
        } while (lc > 0);
    }
}
