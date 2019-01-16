/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai1_ptb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pt = new Scanner(System.in );
        System.out.print("Nhap a: ");
        float a = pt.nextFloat();
        System.out.print("Nhap b: ");
        float b = pt.nextFloat();
        System.out.print("Nhap c: ");
        float c  = pt.nextFloat(); 
        float delta = b*b-4*a*c;
        if(a==0){
        	if(b==0){
                    if(c==0) System.out.print("pt co vo so nghiem");
                    else System.out.print("pt vo nghiem");
        	}
        	else{
        		System.out.printf("Pt co 1 nghiem don x= %.2f", -c/b);
        	}
        }
       
        else{
        	if(delta<0){
                                System.out.print("Pt vo nghiem");
        	}
        	else if(delta==0){
	            System.out.printf("Pt co nghiem kep x = %.2f", -b/(2*a));
                }
                else
                    System.out.printf("Pt co 2 nghiem phan biet: x1 =%.2f, X2= %.2f", (-b+sqrt(delta))/(2*a), (-b-sqrt(delta))/(2*a) );
		// your code goes here
        }
    }
}
    

