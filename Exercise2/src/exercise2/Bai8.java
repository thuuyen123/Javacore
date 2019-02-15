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
public class Bai8 {
    public static long giaiThua(int n){
        if(n==0 || n==2 ) return 1;
        int giaithua =1;
        for(int i=1;i<=n;i++){
            giaithua *= i;
        }
        return giaithua;       
    }
      
    public static void main(String[] args) {
    
        int giaithua =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap goc x:");
        double x = sc.nextDouble();// đơn vị là độ
  
     //đổi sang rad
        double ERR = 0.0001;
        double dif=0;
        double xrad = x * Math.PI / 180; 
        double sinx=0;
        int i=0;
        do{
           // for(int i=0;i<n;i++){
            dif = pow(-1,i)*pow(xrad,2*i+1)/giaiThua(2*i+1);
            sinx +=dif;
            i++;
            System.out.println("sinx["+ x + "]= " + sinx);
        }while(Math.abs(dif) > ERR);
       
        System.out.println("==========================");
        System.out.println("sinx["+ x + "]= " + sinx);
//        double sin =0;
//        for(int i=0;i<=n;i++){
//            
//            sin  += pow(-1,i)*pow(x,2*i+1)/giaiThua(2*i+1);
//        }
//        System.out.printf("Sin(x) = %.4f", sin);
//        System.out.println("");
    }
    
}
