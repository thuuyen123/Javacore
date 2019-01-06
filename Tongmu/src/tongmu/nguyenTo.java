/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tongmu;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class nguyenTo {//kiem tra so nguyen to
    public static void main(String[] args){
          Scanner nt = new Scanner(System.in);
          int n = nt.nextInt();
          int temp=0;
          if(n<2) System.out.print("N ko phai so nguyen to");
          for(int i=2; i<=sqrt(n);i++){
                    if(n%i==0){
                              System.out.print("N ko phai so nguyen to");
                              temp=1;
            }
       }
        if(temp==1) System.out.print("N la so ngto");
    }
    
}
