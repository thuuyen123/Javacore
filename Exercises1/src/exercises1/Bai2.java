/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises1;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap a > ");
        float a =sc.nextFloat();
        System.out.print("Nhap b > ");
        float b = sc.nextFloat();
        System.out.print("Nhap c > ");
        float c = sc.nextFloat();
        if(a==0){
            if(b==0) {
                if(b==c) System.out.println("Pt co vo so nghiem");
                else System.out.println("Pt vo nghiem");
            }
        }
        else System.out.printf("x = %.6f", (c-b)/a);
        System.out.println();
        
    }
    
}
