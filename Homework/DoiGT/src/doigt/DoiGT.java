/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doigt;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class DoiGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner doi = new Scanner(System.in);
        System.out.print("Nhap a > ");
        float a = doi.nextFloat();
        System.out.print("Nhap b > ");
        float b = doi.nextFloat();
        float temp =a;
        a=b;
        b=temp;
        System.out.println("Ket qua");
        System.out.printf("a = %.1f, b =%.1f", a, b);
      
        // TODO code application logic here
    }
    
}
