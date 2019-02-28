/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Mangez {

    
    public static void main(String args[]){
        Random rd = new Random();
        int a[] = new int[15];
        Scanner sc = new Scanner(System.in);
        System.out.println("Mảng ngẫu nhiên gồm 15 phần tử: ");
        int x;
        for(int i=0;i<15;i++){
            int  number = rd.nextInt();
            x = number%100;
            //System.out.printf("%d ", Math.abs(x));
            a[i] = Math.abs(x);
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        int temp;
        System.out.println("Mảng được sắp xếp tăng dần là: ");
        for(int i=0;i<15;i++){
            for(int j=i+1;j<15;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        System.out.println("Mảng được sắp xếp giảm dần là: ");
        for(int i=0;i<15;i++){
            for(int j=i+1;j<15;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        int count1 =0;
        for(int i=0;i<15;i++){
            if(a[i]%2==0)
                count1++;
        }
        System.out.println("Số phần tử chẵn của mảng là: " +count1);
        int count2=0;
        for(int i=0;i<15;i++){
            if(a[i]%2!=0)
                count2++;
        }
        System.out.println("Số phần tử lẻ của mảng là: " +count2);
    }

}