/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangez;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Mangez {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] a = new int[5];
        System.out.print("Nhap mang: ");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        Tinh b = new Tinh();
        System.out.println("chon thao tac so:");
        int lc = sc.nextInt();
        switch(lc){
            case 0: break;
            case 1:{
                
                b.sum();
                break;
            }
            case 2:{
                
                b.sumle();
                break;
            }
            case 3:{
                b.sumch();
                break;
            }
            case 4:{
                b.max();
                break;
                
            }
            case 5:{
                b.min();
                break;
            }
            case 6:{
                b.chia();
                break;
            }
        }
   }
    
}
class Tinh{
       int[] a = new int[5];
//   Scanner sc = new Scanner(System.in);
//   void init(){
//       for(int i=0;i<5;i++){
//           a[i]= sc.nextInt();
//       }
//   }
    void sum(){
            int tong =0;
            for(int i=0;i<5;i++){
                tong += a[i];
            }
        System.out.print("Tong:"+ tong);
    }
    void sumle(){
        int tongle = 0;
        for(int i=0;i<5;i++){
            if(a[i]% 2 !=0)  
                tongle += a[i];
        }
        System.out.println("Tong la : " +tongle);
    }
    void sumch(){
        int tongch=0;
        for(int i=0;i<5;i++){
            if(a[i]%2==0) 
                tongch +=a[i];
        }
         System.out.println("Tong la : " +tongch);
    }
    void max(){
        int max=0;
        for(int i=0;i<5;i++){
            if(a[i]>max )  max=a[i];
        }
        System.out.println("phan tu lon nhat trong mang la : "+ max);
    }
    void min(){
        int min=1000000;
        for(int i=0;i<5;i++){
            if(a[i]<min )  min=a[i];
        }
        System.out.println("phan tu lon nhat trong mang la : "+ min);
       
    }
    void chia(){
        for(int i=0;i<5;i++){
            if(a[i]%3 ==0) System.out.printf("", a[i]);
        }
    }

}