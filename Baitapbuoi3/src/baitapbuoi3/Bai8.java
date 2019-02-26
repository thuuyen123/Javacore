/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi3;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai8 {
    public static void Nhap(int a[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ma trận: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
               a[i][j] = sc.nextInt();  
            }
        }
    }
    public static void checkDV(int a[][]){
        int kt=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if((i==j && a[i][j]== 1) || (i!=j && a[i][j]==0)) kt=1;
                else {
                    kt=0;
                    break;
                }
            }
        }
        if(kt == 1) System.out.println("Ma trận trên là ma trận đơn vị");
        else System.out.println("Ma trận trên ko phải là ma trận đơn vị");
    }
    public static void checkKH(int a[][]){
        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j] !=0 ){
                    check =false;
                    break;
                }
            
            }
        }
        if(check == true) System.out.println("Ma trận trên là ma trận không");
        else System.out.println("Ma trận trên ko phải là ma trận không");
    }
    public static void checkDX(int a[][]){
        boolean check = true;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i][j] != a[j][i]) {
                    check =false;
                    break;
                }
            }
        }
        if(check == true)  System.out.println("Ma trận trên là ma trận đối xứng");
        else System.out.println("Ma trận trên ko phải là ma trận đối xứng");
    }
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Nhap(a);
        checkDV(a);
        checkKH(a);
        checkDX(a);
    
    }
}
