/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptbn;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Ptbn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        System.out.print("Nhap a => ");
        float a = pt.nextFloat();
        System.out.print("Nhap b > ");
        float b = pt.nextFloat();
        System.out.print("Nhap c > ");
        float c = pt.nextFloat();
        System.out.println("Kết quả");
        if(a==0) {
           if(b==0)
                     System.out.print("pt co vo so nghiem");
           else 
                     System.out.print("pt co vo nghiem");
        }
        else
                System.out.printf("x =%f", (c-b)/a);
    
        // TODO code application logic here
    }

}
