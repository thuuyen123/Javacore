/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int m=a*b;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else b=b-a;
        }
       System.out.printf("Bcnn bang %d", m);
       System.out.printf("UCLN bang %d ", b);
       
        // TODO code application logic here
    }
}
