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
public class Bai5 {
    static void Sum(int a[], int b[]){
        int sum =0;
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] =a[i]+b[i];
        }
        System.out.println("Tổng của 2 vector là: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(""+c[i]+" ");
        }
    }
    static void Tich(int a[], int b[]){
        int tich =0;
        for (int i = 0; i < a.length; i++) {
            tich +=a[i]*b[i];            
        }
        System.out.println("Tích của 2 vecter là: "+ tich);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[3];
        System.out.println("Nhập vetor A:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b= new int[3];
        System.out.println("Nhập vetor B:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        Sum(a,b);
        Tich(a,b);
    }
}
