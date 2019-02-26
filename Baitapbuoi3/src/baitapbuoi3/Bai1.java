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
public class Bai1 {

    static void Sum(int a[]){
        int sum=0;  
        for (int i = 0; i < 5; i++) {
            sum+=a[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " +sum);
    }
    static void Suml(int a[]){
        int suml=0;  
        for (int i = 0; i < 5; i++) {
            if(a[i]%2!=0) suml+=a[i];
        }
        System.out.println("Tổng các phần tử lẻ trong mảng là: " +suml);
    }
    static void Sumc(int a[]){
        int sumc=0;  
        for (int i = 0; i < 5; i++) {
           if(a[i]%2==0) sumc +=a[i];
        }
        System.out.println("Tổng các phần tử chẵn trong mảng là: " +sumc);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        int[] a = new int[5];
        System.out.print("Nhap mang: ");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for(int i=0;i<5;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("");
        Sum(a);
        Suml(a);
        Sumc(a);
    }
    
}
