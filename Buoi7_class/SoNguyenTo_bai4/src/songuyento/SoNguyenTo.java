/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SoNguyenTo {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public SoNguyenTo() {
    }

    public SoNguyenTo(int a) {
        this.a = a;
    }
//    public void Nhap(int x){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số x:");
//        x = sc.nextInt();
//    }
    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i ==0) return false;
        }
        return true;
    }
    public void SoNguyenTo(int x){
       
        if(isSoNguyenTo(x) == true ) 
        { 
            a= x;
            System.out.println("Số nguyên tố a: "+a);
        }
        else System.out.println("Số đó không phải số nguyên tố ");
        
    }
    public int timSoNguyenToTiepTheo(){
        if(a!=0){
            int i = a+1;
            while(i>0){
                if(isSoNguyenTo(i)== true){
                    break;
                }
                else i++;
            }
        return i;
        }
        return 0;
    }
}
