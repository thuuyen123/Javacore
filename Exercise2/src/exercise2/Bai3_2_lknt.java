/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai3_2_lknt {
    static boolean ckeck(int n ){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int temp=0;
        System.out.println("N so nguyen to dau tien la: ");
        for(int i=0;i<10000;i++){
            if(ckeck(i)==true){
                System.out.println("" + i);
                temp++;
            }
            if(temp == n) break;
        }
        
        
    }
}