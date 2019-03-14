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
        System.out.println( tu+"/"+mau );
        
    }
    
    public int UCLN(){
        //int m = tu*mau;
        int a = tu;
        int b = mau;
        while(a!=b){
            if(a>b) a= a-b;
            else b=b-a;
        }
        return a;
    }
    public void RutGon(){
        int uc = UCLN();
        
        if(tu % mau ==0) System.out.println("Phân số tối giản là: "+ tu/mau);
        else
            System.out.println("Phân số tối giản là: "+(tu/uc)+"/"+(mau/uc));
    }
    public void Nghich(){
        int uc = UCLN();
        if(tu%mau==0) {
            System.out.println("Phân số nghịch đảo là: 1/"+ tu/mau);
        }
        else System.out.println("Phân số nghịch đảo là: "+(mau/uc)+"/"+ (tu/uc));
    }
   public Fraction cong(Fraction ps){
       Fraction tong = new Fraction();
       tong.tu = this.tu*ps.getMau()+this.mau*ps.getTu();
       tong.mau = this.mau*ps.getMau();
       return tong;
   }
    public Fraction tru(Fraction ps){
       Fraction hieu = new Fraction();
       hieu.tu = this.tu*ps.getMau()-this.mau*ps.getTu();
       hieu.mau = this.mau*ps.getMau();
       return hieu;
   }
    public Fraction nhan(Fraction ps){
       Fraction tich = new Fraction();
       tich.tu = this.tu*ps.getTu();
       tich.mau = this.mau*ps.getMau();
       return tich;
   }
    public Fraction chia(Fraction ps){
       Fraction thuong = new Fraction();
       thuong.tu = this.tu*ps.getMau();
       thuong.mau = this.mau*ps.getTu();
       return thuong;
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction ps1 = new Fraction();
        ps1.Nhap();
//        Fraction ps2 = new Fraction();
//        ps2.Nhap();
//        Fraction tong;
//        Fraction tru;
//        Fraction nhan;
//        Fraction chia;
        int lc;
        do{
            System.out.println("=============Menu================");
            System.out.println("1.In ra phân số vừa nhập");
            System.out.println("2.Rút gọn phân số");
            System.out.println("3.Nghịch đảo phân số");
            System.out.println("4.Tính tổng 2 phân số");
            System.out.println("5.Tính hiệu 2 phân số");
            System.out.println("6.Tính tích 2 phân số");
            System.out.println("7.Tính thương 2 phân số");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn chọn thao tác: ");
            lc = sc.nextInt();
            switch(lc){
                case 0:{
                    break;
                }
                case 1:{
                    System.out.println("Phân số vừa nhập là:");
                    ps1.In();
                    break;
                }
                case 2:{
                    ps1.RutGon();
                    break;
                }
                case 3:{
                    ps1.Nghich();
                    break;
                }
                case 4:{
                    System.out.println("Nhập phân số thứ 2:");
                    Fraction ps2 = new Fraction();
                    ps2.Nhap();
                    Fraction tong;
                    tong =ps1.cong(ps2);
                    
                    System.out.println("Tổng của 2 phân số là:");
                    tong.In();
                    break;
                }
                case 5:{
                    System.out.println("Nhập phân số thứ 2:");
                    Fraction ps2 = new Fraction();
                    ps2.Nhap();
                    Fraction hieu;
                    hieu =ps1.tru(ps2);
                    System.out.println("Hiệu của 2 phân số là:");
                    hieu.In();
                    break;
                }
                case 6:{
                    System.out.println("Nhập phân số thứ 2:");
                    Fraction ps2 = new Fraction();
                    ps2.Nhap();
                    Fraction tich;
                    tich =ps1.nhan(ps2);
                    
                    System.out.println("Tích của 2 phân số là:");
                    tich.In();
                    break;
                }
                case 7:{
                    System.out.println("Nhập phân số thứ 2:");
                    Fraction ps2 = new Fraction();
                    ps2.Nhap();
                    Fraction thuong;
                    thuong =ps1.chia(ps2);
                    
                    System.out.println("Thương của 2 phân số là:");
                    thuong.In();
                    break;
                }
                
            }
         if(lc ==0) break;
        }while(lc>=0&& lc< 8);
    }   
}
