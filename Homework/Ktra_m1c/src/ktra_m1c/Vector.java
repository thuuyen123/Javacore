/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra_m1c;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Vector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vector A:");

        float[] a = new float[3];
        for(int i=0;i<3;i++){
            a[i]= sc.nextFloat();
        }
        System.out.println("Nhap vector B ");
        float[] b = new float[3];
        for(int i=0;i<3;i++){
            b[i]= sc.nextFloat();
        }
        int tong=0;
        int tich=0;
        for(int i=0;i<3;i++){
            tich+=a[i]*b[i];
        }
        System.out.println("Tich vo huong 2 vector la: "+ tich);
        for(int i=0;i<3;i++){
            tong+=pow(a[i]+b[i],2);
        }
        System.out.printf("Tong cua hai vector la: %f", sqrt(tong));
        
        
    }
    
    
}
