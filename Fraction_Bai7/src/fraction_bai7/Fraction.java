/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction_bai7;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Fraction {
    private int tu;
    private int mau;

    public Fraction() {
    }

    public Fraction(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử");
        tu = sc.nextInt();
        do{
            System.out.println("Nhập mẫu");
            mau = sc.nextInt();
        }while(mau ==0);
    }
    public void In(){
        System.out.print("Phân số vừa nhập là: " + tu+"/"+mau );
        
    }
    
    public int UCLN(){
        //int m = tu*mau;
        while(tu!=mau){
            if(tu>mau) tu= tu-mau;
            else mau=mau-tu;
        }
        return tu;
    }
    public void RutGon(){
        
        
        if(tu % mau ==0) System.out.println("Phân số tối giản là: "+ tu/mau);
        else
            System.out.println("Phân số tối giản là: "+(tu/UCLN())+"/"+(mau/UCLN()));
    }
    public void Nghich(){
        
        if(tu % mau ==0) 
            System.out.println("Phân số nghịch đảo là: 1/"+ tu/mau);
        else System.out.println("Phân số nghịch đảo là: "+(mau/UCLN())+"/"+ (tu/UCLN()));
    }
    
    
    public static void main(String[] args) {
        Fraction f = new Fraction();
        f.Nhap();
        f.In();
        f.RutGon();
        f.Nghich();
    }    
}
