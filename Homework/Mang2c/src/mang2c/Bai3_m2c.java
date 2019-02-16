/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2c;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai3_m2c {
    public static void main( String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ma tran : ");
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int kt1=0,kt2=0,kt3=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if( i==j && a[i][j]==1 || i!=j && a[i][j]==0) {
                   kt2=1;
               } 
               else{
                   kt2=0;
                   break;
               }
            }
        }
        if(kt2==1) System.out.println("Ma tran tren la ma tran don vi");
        else System.out.println("Ma tran tren ko phai la ma tran don vi");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(a[i][j] !=0) {
                   kt1=1;
                   break;
               } 
            }
        }
        if(kt1==1) System.out.println("Ma tran tren ko phai ma tran 0");
        else System.out.println("Ma tran tren la ma tran 0");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]!=a[j][i]){
                    kt3=1;
                    break;
                }
            }
        }
               
           
        if(kt3==1) System.out.println("Ma tran tren ko phai ma tran doi sung");
        else System.out.println("Ma tran tren la ma tran doi xung");
    }
    
}
