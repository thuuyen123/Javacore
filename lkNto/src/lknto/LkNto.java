/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lknto;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class LkNto {
           static boolean checkNto(int n){
                    if(n<2) return false;
                    for(int i=2;i<=sqrt(n);i++){
                              if(n%i==0) return false;
                    }
                    return true;
           }
           public static void main(String[] args) {
                    Scanner nt= new Scanner(System.in);
                    int n = nt.nextInt();
                    for(int i=1;i<=n;i++){
                              if(checkNto(i)==true) System.out.printf("%d ", i);
                    }
           }
}
    /**
     * @param args the command line arguments
     */
   
