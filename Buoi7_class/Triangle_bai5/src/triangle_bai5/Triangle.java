/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle_bai5;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Triangle {
    private float a;
    private float b;
    private float c;
    public Triangle(){
    
    }
    public Triangle(float a, float b, float c){
        this.a =a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        setA(sc.nextFloat());
        System.out.println("Nhập cạnh b");
        setB(sc.nextFloat());
        System.out.println("Nhập cạnh c");
        setC(sc.nextFloat());
    }
    public boolean check(){
        if(a+b > c && a+c>b && b+c>a) return true;
        else return false;
    }    
//    public void Kieu(){
//        
//        if(pow(a,2)+pow(b,2)==pow(c,2) && a==b || pow(b,2)+pow(c,2)==pow(a,2) && b==c || pow(a,2)+pow(c,2)==pow(b,2) && a==c) System.out.println("Tam giác vuông cân");
//        else {if(pow(a,2)+pow(b,2)==pow(c,2) || pow(b,2)+pow(c,2)==pow(a,2) || pow(a,2)+pow(c,2)==pow(b,2))
//            System.out.println("Tam giác vuông");
//        }
//        if(a==b && b==c && c==a) System.out.println("Tam giác đều");
//        else if(a==b || b==c || c==a) System.out.println("Tam giác cân"); 
//       
//        else System.out.println("Tam giac thường");
//       
//    }
    public void ChuVi(){
        System.out.println("Chu vi tam giác trên là "+ (a+b+c));
    }
    public void DienTich(){
        float p = (a+b+c)/2;
        System.out.println("Diện tích tam giác trên là "+ Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.Nhap();
        if(t.check() == true ) {
          //  t.Kieu();
            t.ChuVi();
            t.DienTich();
        }
        else System.out.println("Ba cạnh trên ko phải là ba cạnh của 1 tam giác");
    }
}
