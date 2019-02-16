/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bosung;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang m");
        int m = sc.nextInt();
        System.out.println("Nhap cot n");
        int n = sc.nextInt();
        
        System.out.println("Hinh chu nhat dac kich thuoc mxn:");
        
        for (int i = 0; i < m ; i++) {
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
