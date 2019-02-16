/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SoNguyenTo {
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public SoNguyenTo(){}
//    public SoNguyenTo(int a){
//        this.a=a;
//    }
    public SoNguyenTo(int x){
        //Scanner sc =new Scanner(System.in);
        //int x = sc.nextInt();
        int kt1=0;
        if(x<2) System.out.println("x khong phai so nguyen to");
        for(int i=2;i<sqrt(x);i++){
            if(x%i==0){
                kt1=1;
                break;
            }
        }
        if(kt1==1) System.out.println("x khong phai so nguyen to");
        else{
            a=x;
        }
    }
    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
        for(int i=2;i<sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public int timSoNguyenToTiepTheo(int n){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int temp=n++;
        int kt2=0;
        while(temp>n){
            if(isSoNguyenTo(temp)){
                kt2=1;
                break;
               
            } 
            else temp++;
        }
        if(kt2==1) 
            return temp;
        else return 0;
    }
    void display(int a){
        System.out.println(""+a);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoNguyenTo s = new SoNguyenTo();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        s.display(s.timSoNguyenToTiepTheo(x));
        // TODO code application logic here
    }
    
}
