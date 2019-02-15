/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai9 {
   public int giaiThua(int n){
       int giaithua =1;
        for(int i=1;i<=n;i++){
            giaithua *= i;
        }
        return giaithua;       
    }
    public static void main(String[] args) {
        Bai8 b = new Bai8();
        int giaithua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        float x = sc.nextFloat();
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        double cos =0;
        for(int i=0;i<=n;i++){
            cos  += pow(-1,i)*pow(x,2*i)/ b.giaiThua(2*i);
        }
        System.out.printf("Cos(x) = %.4f", cos);
        System.out.println("");
    }
}
