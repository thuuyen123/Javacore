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
public class Bai4_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =0;
        int n;
        do{
            System.out.println("Nhap so: ");
             n = sc.nextInt();
            if(n > max ) max = n;
        }while(n != 0);
        System.out.println("SO lon nhat: " +max);
    }
   
}
