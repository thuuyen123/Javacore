/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_bai9;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Vector {
    private int tung;
    private int hoanh;

    public int getTung() {
        return tung;
    }

    public void setTung(int tung) {
        this.tung = tung;
    }

    public int getHoanh() {
        return hoanh;
    }

    public void setHoanh(int hoanh) {
        this.hoanh = hoanh;
    }

    public Vector() {
    }

    public Vector(int tung, int hoanh) {
        this.tung = tung;
        this.hoanh = hoanh;
    }

   
    public void addVector(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hoàng độ: ");
        setHoanh(sc.nextInt()); 
        System.out.println("Nhập tung độ: ");
        setTung(sc.nextInt()); 
    }
    public void printVectot(){
        System.out.println("Vector: ("+hoanh+","+tung+")");
    }
    
    public boolean  check(Vector vt){
        if(this.tung == vt.getTung() && this.hoanh == vt.getHoanh()) return true;
        else return false;
    }
    public Vector Cong(Vector vt){
        Vector tong = new Vector();
        tong.hoanh = this.hoanh + vt.getHoanh();
        tong.tung = this.tung + vt.getTung();
        return tong;
    }
    public Vector Tru(Vector vt){
        Vector hieu = new Vector();
        hieu.hoanh = this.hoanh - vt.getHoanh();
        hieu.tung =this.tung - vt.getTung();
        return hieu;
    }
    public int Nhan(Vector vt){
        int tich = 0;
        tich = this.hoanh*vt.hoanh + this.tung*vt.tung;
        return tich;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector vector = new Vector();
        vector.addVector();
        System.out.println("Nhập vector thứ 2");
        Vector vt2 = new Vector();
        vt2.addVector();
        vector.printVectot();
        vt2.printVectot();
        int lc;
        do{
            System.out.println("=============Menu===========");
            System.out.println("0.Thoát");
            System.out.println("1.Kiểm tra hai vector có bằng nhau ko?");
            System.out.println("2.Cộng hai vector");
            System.out.println("3.Trừ hai vector");
            System.out.println("4.Nhân hai vector");
            System.out.println("Mời bạn nhập:");
            lc = sc.nextInt();
            switch(lc){
                case 0:{
                    break;
                }
                case 1:{
                    if(vector.check(vt2)== true) System.out.println("hai vector bằng nhau");
                    else System.out.println("Không bằng nhau");
                    break;
                }
                case 2:{
                    Vector tong;
                    tong = vector.Cong(vt2);
                    System.out.println("Tổng của 2 vector là: "+tong);
                    tong.printVectot();
                    break;
                }
                 case 3:{
                    Vector hieu;
                    hieu = vector.Tru(vt2);
                    System.out.println("Hiệu của 2 vector là: ");
                    hieu.printVectot();
                    break;
                }
                  case 4:{
                    int tich;
                    tich = vector.Nhan(vt2);
                    System.out.println("Tổng của 2 vector là: "+ tich);
                    break;
                }
            }
            if(lc==0 ) break;
        }while(lc>=0 && lc <=4);
    }
}
    
