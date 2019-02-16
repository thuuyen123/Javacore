/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2c;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai1_m2c {
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ma tran: ");
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("In ra ma tran: ");
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
        int tongh=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tongh+=a[i][j];
            }
            System.out.printf("Tong hang thu %d la: ", i+1);
            System.out.printf("%d ", tongh);
            System.out.println();
            tongh=0;
        }
        int tongc=0;
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                tongc+=a[i][j];
            }
            System.out.printf("Tong cot thu %d la: ", j+1);
            System.out.printf("%d ", tongc);
            System.out.println();
            tongc=0;
        }
             
    }
    
}
