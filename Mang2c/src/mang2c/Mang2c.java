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
public class Mang2c {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BAI 2
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ma tran thu nhat: ");
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap ma tran thu hai: ");
        int[][] b = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = sc.nextInt();
            }
        }
        int[][] tong = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tong[i][j]= a[i][j]+b[i][j];
            }
        }
        
        System.out.println("Ma tran Tong cua 2 ma tran la: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%d ", tong[i][j]);
            }
            System.out.println();
        }
        
        int[][] tich = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tich[i][j] = 0;
            }
            
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    tich[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Tich cua hai ma tran la: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%d ", tich[i][j]);
            }
            System.out.println();
        }
     
    }
}
