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
    
    public Mang2chieu(){
        this.col = 3;
        this.rum = 3;
        this.a = new int[3][3];
    }
    public Mang2chieu(int col, int rum, int[][] a) {
        this.col = col;
        this.rum = rum;
        this.a = a;
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
    public void nhapMang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        setRum(sc.nextInt());
        System.out.println("Nhập số cột: ");
        setCol(sc.nextInt());
        System.out.println("Nhập mảng 2 chiều:");
        for (int i = 0; i < rum; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public void Result(){
        for (int i = 0; i < rum; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(""+a[i][j]+" ");
            }
            
        }
    }
}
