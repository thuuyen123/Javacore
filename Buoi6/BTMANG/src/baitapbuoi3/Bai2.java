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
public class Bai2 {
    static void Max(int a[]){
        int max =a[0];
        for (int i = 0; i < a.length; i++) {
           if(a[i]>max) max=a[i];
        }
        System.out.println("Phần tử lớn nhất của mảng là: "+max);
    }
    static void Min(int a[]){
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min) min=a[i];
        }
        System.out.println("Phần tử nhỏ nhất của mảng là: "+min);
        
    }
    static void ChiaH(int a[]){
        System.out.println("Tất cả các phần tử chia hết cho 3 là: ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%3==0) System.out.println(""+a[i]+" ");
            
        }
    
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] a = new int[5];
        System.out.print("Nhap mang: ");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        Max(a);
        Min(a);
        ChiaH(a);
  
    }
}

