/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmang2c;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Mang2chieu {
    private int col;// hàng
    private int rum;// cột
    private int[][] a;
    private int[][] b;
    
    public Mang2chieu(){
        this.col = 3;
        this.rum = 3;
        this.a = new int[3][3];
        this.b = new int[3][3];
    }
    public Mang2chieu(int col, int rum, int[][] a, int[][] b) {
        this.col = col;
        this.rum = rum;
        this.a = a;
        this.b = b;
    }

    public int[][] getB() {
        return b;
    }

    public void setB(int[][] b) {
        this.b = b;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRum() {
        return rum;
    }

    public void setRum(int rum) {
        this.rum = rum;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    public void nhapMangA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng 2 chiều:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public void nhapMangB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng 2 chiều thứ 2:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }
    public void Result(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(""+a[i][j]+" ");
            }
            System.out.println("");    
        }
    }
    public void sumCol(){
        int sumH=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Tổng hàng thứ "+(i+1)+" là: ");
            for (int j = 0; j < 3; j++) {
                sumH += a[i][j];  
            }
            System.out.println(""+sumH);
            sumH=0;
        }
    }
    public void sumRum(){
        int sumC=0;
        for (int j = 0; j< 3; j++) {
            System.out.println("Tổng cột thứ "+(j+1)+" là: ");
            for (int i = 0; i < 3; i++) {
                sumC += a[i][j];  
            }
            System.out.println(""+sumC);
            sumC=0;
        }
    }
    public void sum2MT(){
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(""+c[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void Tich2MT(){
        int[][] c =  new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
    }
    public  void checkDV(){
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
    public void checkKH(){
        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] !=0 ){
                    check =false;
                    break;
                }
            
            }
        }
        if(check == true) System.out.println("Ma trận trên là ma trận không");
        else System.out.println("Ma trận trên ko phải là ma trận không");
    }
    public  void checkDX(){
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
}
