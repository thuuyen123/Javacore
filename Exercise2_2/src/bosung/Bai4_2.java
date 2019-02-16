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
public class Bai4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do cao h =");
        int h = sc.nextInt();
        for(int i=0;i<h;i++){
            //in khoang trang
            for(int k=0;k<h-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                //neu la dong dau tien hay dong cuoi cung
                if(i==0  || i == h-1)
                    System.out.print("*");
                //neu khong
                else {
                    //neu la vi tri dau tien hay vi tri cuoi cung thi in ra *
                    if(j==0 || j==2*i ) System.out.print("*");
                    //neu ko in ra khoang trang
                    else System.out.print(" ");
                }
             }
            System.out.println("");
            
        }
    }
 
}
