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
public class Bai7 {
    public static void nhap(int a[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void In(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(""+a[i][j]+" " );
            }
            System.out.println("");
            
        }
    }
    public static void Sum(int a[][], int b[][]){
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(""+c[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void Tich(int a[][], int b[][]){
        int[][] c =  new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        In(c);
    }
    public static void main(String[] args) {
        
        int[][] a = new int[3][3];
        System.out.println("Nhập ma trận thứ nhất: ");
        nhap(a);
        int[][] b = new int[3][3];
        System.out.println("Nhập ma trận thứ 2: ");
        nhap(b);
        System.out.println("Tổng hai ma trận là:");
        Sum(a,b);
        System.out.println("Tích hai ma trận là: ");
        Tich(a,b);
        
        
    }
}
