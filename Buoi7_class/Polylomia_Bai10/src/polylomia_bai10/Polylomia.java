/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polylomia_bai10;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Polylomia {
    private int[] a;

    public Polylomia() {
    }

    public Polylomia(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đa thức bậc: ");
        int n = sc.nextInt();
       
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập hệ số của x mũ " + i + " là: ");
            a[i] = sc.nextInt();
        }
    }
   
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Polylomia p1 = new Polylomia();
       p1.Nhap();
       Polylomia p2= new Polylomia();
       p2.Nhap();
       int[] c = {0};// chứa mảng tích
        for (int i = 0; i < p1.a.length; i++) {
            for (int j = i; j >=0 ; j--) {
                c[i] += p1.a[j]* p2.a[i-j];
            }
        }
        // TODO code application logic here
    }
    
}
