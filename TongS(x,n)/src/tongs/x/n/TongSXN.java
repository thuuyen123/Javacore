/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tongs.x.n;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class TongSXN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float n = sc.nextFloat();
          float x = sc.nextFloat();
          float sum10=0;
          float sum9=0;
          double sum11=0;
          for(int i=1; i<=n;i++){
                sum9 +=pow(x,i);
          }
          System.out.printf("sum9=%f", sum9);
          System.out.println("");
          for(int i=1; i<=n;i++){
                sum10 += pow(x,2*i);
          }
          System.out.printf("sum10= %f", sum10);
          System.out.println("");
          for(int i=0; i<=n;i++){
                sum11 += pow(x,(2*i+1));
          }
          System.out.printf("sum 11= %f", sum11);
          System.out.println("");
          
        // TODO code application logic here
    }
    
}
