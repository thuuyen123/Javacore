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
public class Bai4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do cao h =");
        int h = sc.nextInt();
        for(int i=0;i<h;i++){
            //in khoang trang
            for(int k=0;k<h-i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
    
    
}
