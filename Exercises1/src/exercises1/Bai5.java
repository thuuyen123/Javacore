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
public class Bai5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a > ");
        float a = sc.nextFloat();
        System.out.print("Nhap b > ");
        float b = sc.nextFloat();
        float temp;
        temp =a;
        a=b;
        b=temp;
  
        System.out.printf("a = %.1f, b = %.1f", a, b);
        
    }
//co truong hop nao doi cho ko dung bien trung gian ko?
 
}
