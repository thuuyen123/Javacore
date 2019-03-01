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
public class Bai6 {
    public static void sumH(int a[][]){
        int sumH=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Tổng hàng thứ "+(i+1)+" là: ");
            for (int j = 0; j < 3; j++) {
                sumH += a[i][j];  
            }
            System.out.println(""+sumH);
            sumH=0;
        }
    }
    public static void sumC(int a[][]){
        int sumC=0;
        for (int j = 0; j< 3; j++) {
            System.out.println("Tổng cột thứ "+(j+1)+" là: ");
            for (int i = 0; i < 3; i++) {
                sumC += a[i][j];  
            }
            System.out.println(""+sumC);
            sumC=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Nhập ma trận 2 chiều: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                a[i][j] = sc.nextInt();
             }
        }
        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(""+a[i][j]+" ");
            }
            System.out.println("");
        }
        sumH(a);
        sumC(a);
    }
}
