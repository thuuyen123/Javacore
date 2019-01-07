/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra_m1c;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Ktra_m1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] m = new int[5];
        for(int i=0;i<5;i++){
            System.out.printf("Nhap phan tu thu %d: ",i+1);
            m[i] = sc.nextInt();
        }
        System.out.print("Nhap phan so nguyen a: ");
        int a = sc.nextInt();
        int k=0;
        int temp=0;
        for(int i=0;i<5;i++){
            if(m[i]==a){
                k=1;
                temp=i;
                break;
            } 
        }
        if(k==1) System.out.printf("So nguyên a có xuất hiện trong mảng và ở vị trí thứ %d của mảng đó",temp+1);
        else System.out.println("So nguyen a ko xh trong mảng");
        // TODO code application logic here
    }
    
}
