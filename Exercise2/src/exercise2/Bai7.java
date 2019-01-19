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
public class Bai7 {
    public long Fibo(int n){
        long f1=1,f0=1, fn=0;
        
        if(n==0 || n==1 ) fn=1;
        else{
            for(int i=2;i<=n;i++){
                fn=f0+f1;
                f0=f1;
                f1=fn;
            }
        }
    return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap n: ");
        int n = sc.nextInt();
        int dem =0;
        int i=0;
        Bai7 b = new Bai7();
        while(dem <=n){
            System.out.print(" " + b.Fibo(i) );
            dem++;
            i++;
        }
    }
}
