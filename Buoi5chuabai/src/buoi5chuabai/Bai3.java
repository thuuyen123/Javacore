/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5chuabai;
import java.util.Scanner;
/**
 *
 * @author Thu Uyên
 */
public class Bai3 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=30;i++){
            for(int j=0;j<=15;j++){
                for(int k = 0;k<=6;k++){
                    if(i*100000 + j*200000 +k*500000 == 3000000){   
                        System.out.printf("gồm %d tờ 100000, %d tờ 200000 và %d tờ 500000 ",i,j,k);
                        count++;
                    }
                }
                
            } 
        System.out.println("");
        }
       
        System.out.println("count="+count);
    }
       
}
