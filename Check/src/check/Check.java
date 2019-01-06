/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.print("Nhap a > ");
        int a = ch.nextInt();
        System.out.println("Ket qua");
        if(a%2==0) 
            System.out.print("a la so chan");
        else System.out.print("a la so le");
        
        // TODO code application logic here
    }
    
}
