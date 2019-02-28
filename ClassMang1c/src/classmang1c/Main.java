/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmang1c;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Mang1c mang = new Mang1c();
       mang.nhapMang();
       int lc;
       System.out.println("Chọn thao tác: ");
       do{
           System.out.println("=================//============");
           System.out.println("1.Tính tổng các phần tử của mảng");
           System.out.println("2.Tính tổng các phần tử lẻ trong mảng");
           System.out.println("3.TÍnh tổng các phần tử chẵn trong mảng");
           System.out.println("4.Tìm phần tử  lớn nhất trong mảng");
           System.out.println("5.Tìm phần tử nhỏ nhât trong mảng");
           System.out.println("6.Tìm các phần tử trong mảng chia hết cho 3");
           System.out.println("7.Tìm số nguyên x có xuất hiện trong mảng hay ko?");
           System.out.println("8.Thoát");
           System.out.print("Mời bạn nhập lựa chọn số :  ");
            lc = sc.nextInt();
           switch(lc){
               case 1:{
                   mang.sumMang();
                   break;
               }
               case 2:{
                   mang.sumMangLe();
                   break;
               }
               case 3:{
                   mang.sumMangChan();
                   break;
               }
               case 4:{
                   mang.Max();
                   break;
               }
               case 5:{
                   mang.Min();
                   break;
               }
               case 6:{
                   mang.chiaHet3();
                   break;
               }
               case 7:{
                   mang.checkXuathien();
                   break;
               }
               case 8:{
                   break;
               }
           }
               
       }while( lc>0 && lc!=8 );
       
     }
    
}
