/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoaile;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Ngoaile {

//    public double div(double a, double b) throws Exception{
//        if(b==0) throw new  ArithmeticException();
//        return a/b;
//    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        Scanner sc = new Scanner(System.in);
        int a = cal.inputNumber();
        int b = cal.inputNumber();
        System.out.println(a+b);
       
        
    }
            
    
    
}
