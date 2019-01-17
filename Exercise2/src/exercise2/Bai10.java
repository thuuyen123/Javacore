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
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int temp=n;
        int tg=0;
        while(n>0){
            tg = n%10 +tg*10;
            n/=10;
        }
        if(tg==temp) System.out.println("Là số đối xứng");
        else System.out.println("Ko phải đõi xứng");
                
    }
           
}
