/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydate;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class MyDate {
    private int ngay;
    private int thang;
    private int nam;

    public MyDate() {
    }

    public MyDate(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public boolean checkNhuan(int nam){
      if(nam %100 ==0){
          if(nam %400==0) return true;
          else return false;
      }
      else if( nam %4 ==0 ) return true;
      return false;
    }
    
    public int CheckNgay(int thang, int nam){
        int maxNgay=0;
        if(thang == 1 ||thang ==3 || thang ==5 ||thang==7 || thang==8 ||thang ==10||thang==12) return maxNgay=31;
        else{
            if(thang == 2){
                if(checkNhuan(nam)==true) return maxNgay=29;
                else return maxNgay=28;
            }
            else return maxNgay =30;
        }
    }
    Scanner sc = new Scanner(System.in);
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm:");
        nam = sc.nextInt();
        do{
            System.out.println("Nhập tháng: ");
            thang = sc.nextInt();
        }while(this.thang <=0 || this.thang >12 );
        do{
            System.out.println("Nhập ngày:");
            ngay = sc.nextInt();
        }while(this.ngay <=0 || this.ngay > CheckNgay(thang, nam));
    }
    public void inShort(){
        System.out.println("Hiển thị:");
        System.out.println(ngay+"/"+thang+"/"+nam);
    }
    public void inLong(){
        System.out.println("Hiển thị: ");
        System.out.println("Ngày "+ngay+" Tháng "+ thang + " Năm "+ nam);
    }
    public void cong(int ngay, int thang, int nam){
        System.out.print("Nhập số ngày cộng thêm: ");
        int add = sc.nextInt();
        if(add + ngay <= CheckNgay(thang, nam)) ngay += add;
        else{
            int temp = add - (CheckNgay(thang,nam)- ngay);
            ngay = temp;
            thang++;
        }
    }
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setNam(0);
        date.setNgay(0);
        date.setThang(0);
        date.Nhap();
        date.inShort();
        date.inLong();
      //  date.cong(ngay,thang,nam);
        date.inShort();
    }
}
