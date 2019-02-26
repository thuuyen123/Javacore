/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi3;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] m = new int[5];
        System.out.println("Nhập mảng số nguyên 5 phần tử: ");
        for (int i = 0; i < 5; i++) {
            //System.out.printf("Nhap phan tu thu %d: ", i + 1);
            m[i] = sc.nextInt();
        }
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        int k = 0;
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            if (m[i] == a) {
                k = 1;
                temp = i;
                break;
            }
        }
        if (k == 1) {
            System.out.printf("số nguyên a có xuất hiện trong mảng và ở vị trí thứ %d của mảng đó", temp + 1);
        }
        else {
            System.out.println("Số nguyên a ko xuất hiện trong mảng");
        }
    }
}
