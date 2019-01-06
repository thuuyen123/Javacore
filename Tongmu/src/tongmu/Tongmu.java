/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tongmu;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Tongmu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mu = new Scanner(System.in);
        System.out.print("Nhap x:");
       float  x = mu.nextFloat();
        System.out.print("Nhap n:");
        double tong=0;
        int n = mu.nextInt();
        for(int i=1; i <= n; i++) {
           tong += pow(x,i);
        }
        System.out.printf("kq= %.2f ", tong );
        
        
        // TODO code application logic here
    }
    
}
