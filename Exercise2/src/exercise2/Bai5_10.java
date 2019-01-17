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
public class Bai5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        System.out.println("Nhap x:");
        float x = sc.nextFloat();
        float sum = 0;
        for(int i =1; i<=n;i++){
            sum += Math.pow(x,2*i);
          }
        System.out.printf("%.3f", sum);
    }
}
