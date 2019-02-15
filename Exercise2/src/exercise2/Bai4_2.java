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
public class Bai4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 999999999;
        int n;
        do{
            System.out.println("Nhap so: ");
             n = sc.nextInt();
            if(n<min && n!=0) min = n;
        }while(n != 0);
        System.out.println("SO nho nhat: " +min);
    }
}
