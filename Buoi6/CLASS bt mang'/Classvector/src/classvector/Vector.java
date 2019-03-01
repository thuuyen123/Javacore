/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classvector;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Vector {
    private int num;
    private int[] vtA;
    private int[] vtB;
    
    public Vector(){
        this.num =3;
        this.vtA = new int[3];
        this.vtB = new int[3];
                
    }
    public Vector(int num, int[] vtA, int[] vtB) {
        this.num = num;
        this.vtA = vtA;
        this.vtB = vtB;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getVtA() {
        return vtA;
    }

    public void setVtA(int[] vtA) {
        this.vtA = vtA;
    }

    public int[] getVtB() {
        return vtB;
    }

    public void setVtB(int[] vtB) {
        this.vtB = vtB;
    }
    public  void nhapVtA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập vctor A: ");
        for (int i = 0; i < vtA.length; i++) {
           vtA[i] = sc.nextInt();
        }
    }
    public  void nhapVtB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vector B:");
        for (int i = 0; i < vtB.length; i++) {
           vtB[i] = sc.nextInt();
        }
    }
    public void Sum(){
        int sum =0;
        int[] c = new int[vtA.length];
        for (int i = 0; i < vtA.length; i++) {
            c[i] =vtA[i]+vtB[i];
        }
        System.out.println("Tổng của 2 vector là: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(""+c[i]+" ");
        }
    }
    public void Tich(){
        int tich =0;
        for (int i = 0; i < vtA.length; i++) {
            tich +=vtA[i]*vtB[i];            
        }
        System.out.println("Tích của 2 vecter là: "+ tich);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector vector = new Vector();
        vector.nhapVtA();
        vector.nhapVtB();
        int lc;
        do{
            System.out.println("Chọn thao tác:");
            System.out.println("1.Tính tổng hai vector");
            System.out.println("2.Tính tích vô hướng hai vector");
            System.out.println("3.Thoát");
            System.out.print("Mời nhập lựa chọn: ");
            lc = sc.nextInt();
            switch(lc){
                case 1:{
                    vector.Sum();
                    break;
                }
                case 2:{
                    vector.Tich();
                    break;
                }
                case 3:
                    break;
            }
        }while(lc > 0 && lc != 3);
        
    }
}
