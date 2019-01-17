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
public class Bai5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float sum = 0;
        for(int i =0; i<=n;i++){
            sum += (float)(2*i+1)/(2*i+2);
          }
        System.out.printf("%.3f", sum);
    }
}
