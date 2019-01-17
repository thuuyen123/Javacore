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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a > ");
        float a = sc.nextFloat();
        System.out.print("Nhap b > ");
        float b = sc.nextFloat();
        float max = a;
        if(b > max) System.out.println("a < b");
        else System.out.println("a > b");
        
    }
}
