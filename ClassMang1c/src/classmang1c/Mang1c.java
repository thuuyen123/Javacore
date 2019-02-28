/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmang1c;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Mang1c {
    private int num;
    private int[] a;
    public Mang1c(){
        this.num= 5;
        this.a = new int[5];
    }
    public Mang1c(int num, int[] a){
        this.num = num;
        this.a = a;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] values) {
        this.a = a;
    }
    public void nhapMang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    public void sumMang( ){
      int sum=0;  
        for (int i = 0; i < 5; i++) {
            sum+=a[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " +sum);  
    }
    public void sumMangLe(){
        int suml=0;  
        for (int i = 0; i < 5; i++) {
            if(a[i]%2!=0) suml+=a[i];
        }
        System.out.println("Tổng các phần tử lẻ trong mảng là: " +suml);
    }
    public void sumMangChan(){
        int sumc=0;  
        for (int i = 0; i < 5; i++) {
           if(a[i]%2==0) sumc +=a[i];
        }
        System.out.println("Tổng các phần tử chẵn trong mảng là: " +sumc);
    }
    public void Max(){
        int max =a[0];
        for (int i = 0; i < a.length; i++) {
           if(a[i]>max) max=a[i];
        }
        System.out.println("Phần tử lớn nhất của mảng là: "+max);
    }
    public void Min(){
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min) min=a[i];
        }
        System.out.println("Phần tử nhỏ nhất của mảng là: "+min);
    }
    public void chiaHet3(){
         System.out.println("Tất cả các phần tử chia hết cho 3 là: ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%3==0) System.out.println(""+a[i]+" ");
        }
    }
    public void checkXuathien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử x: ");
        int x= sc.nextInt();
        boolean check = false;
        int vt = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x){
                check = true;
                vt = i+1;
                break;
            }
            else check = false;
        }
        if(check == true ) System.out.println("Số nguyên "+x+" có xuất hiện trong mảng tại vị trí thứ " + vt);
        else System.out.println("Số nguyên "+x+ " ko xuất hiện trong mảng");
    }
 
 }
    