/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_so;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Doc_so {
    public static String chuyenDoiGiaTRi(int n){
        String doc = "";
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
//    public static String chuyenDoiHang(int n){
//        
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = sc.nextInt();
        int temp;
        int count =0;
        while(n>0){
            temp = n%10;
            n/=10;
            count++;
            System.out.print("Giá trị " + temp + " là ");
            if(count ==1) System.out.println("Hàng đơn vị");
            if(count ==2 ) System.out.println("Hàng chục");
            if(count ==3 ) System.out.println("Hàng trăm");
        }
      
    }
    
}
