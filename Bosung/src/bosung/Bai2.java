/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bosung;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai2 {
    public static String DocH(int n){
       String doc= "";
       switch(n){
           case 0: break;
           case 1:{
               doc = "Một";
               break;
           }
           case 2:{
               doc = "Hai";
               break;
           }
           case 3:{
               doc = "Ba";
               break;
           }
           case 4:{
               doc = "Bốn";
               break;
           }
           case 5:{
               doc = "Năm";
               break;
           }
           case 6:{
               doc = "Sáu";
               break;
           }
           case 7:{
               doc = "Bảy";
               break;
           }
           case 8:{
               doc = "Tám";
               break;
           }
           case 9:{
               doc = "Chín";
               break;
           }
       }
       return doc;
   }
    
     public static String Doc(int n){
       String doc= "";
       switch(n){
           case 0: break;
           case 1:{
               doc = "một";
               break;
           }
           case 2:{
               doc = "hai";
               break;
           }
           case 3:{
               doc = "ba";
               break;
           }
           case 4:{
               doc = "bốn";
               break;
           }
           case 5:{
               doc = "năm";
               break;
           }
           case 6:{
               doc = "sáu";
               break;
           }
           case 7:{
               doc = "bảy";
               break;
           }
           case 8:{
               doc = "tám";
               break;
           }
           case 9:{
               doc = "chín";
               break;
           }
       }
       return doc;
}
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen co 3 chu so: ");
        int n = sc.nextInt();
    }
}
