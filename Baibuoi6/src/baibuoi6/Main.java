/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baibuoi6;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] numbers = new double[3];
        Scanner sc = new Scanner(System.in);
        int total =0;
//        System.out.println("Nhap so phan tu: ");
//        int n=sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("So thu "+(i+1)+" :");
            numbers[i] = sc.nextDouble();
            total +=numbers[i];
        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
        System.out.println("sum= "+total);
       for (double item : numbers){//tự động gán lần lượt giá trị của mảng vào biến item, ko quan tâm có bao nhiêu phần tử
           System.out.println(item);
       }
}
    
}
