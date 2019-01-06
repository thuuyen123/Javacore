/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosanh;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Sosanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Nhap a > ");
        float a = ss.nextFloat();
        System.out.print("Nhap b > ");
        float b = ss.nextFloat();
        if(a>b)
            System.out.print("a>b");
        else if(a < b) 
            System.out.print("a<b");
        else 
            System.out.print("a=b");
        
        // TODO code application logic here

    }
    
}
