/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai4 {
    static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }
    // 3 5 6 7 1
    static void sXtang(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>=i+1;j--){
                if(a[i]>a[j]) swap(a[i],a[j]); 
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(""+a[i]+" ");  
        }
        System.out.println("");
    }
    
    static void sXgiam(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>=i+1;j--){
                if(a[i]<a[j]) swap(a[i],a[j]); 
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(""+a[i]+" ");
            
        }
        System.out.println("");
    }
    static void DemC(int a[]){
        int demc=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0) demc++;
        }
        System.out.println("Đếm chẵn = "+demc);
    }
    static void Deml(int a[]){
        int deml=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0) deml++;
        }
        System.out.println("Đếm lẻ = "+deml);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[15];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        System.out.println("Mảng vừa ramdom được: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(""+a[i]+" "); 
        }
        sXtang(a);
        sXgiam(a);
        DemC(a);
        Deml(a);
    }
}
