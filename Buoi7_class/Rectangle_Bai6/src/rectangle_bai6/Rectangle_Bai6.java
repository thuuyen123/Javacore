/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_bai6;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Rectangle_Bai6 {
    private float dai;
    private float rong;

    public Rectangle_Bai6() {
    }
    
    public Rectangle_Bai6(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        dai = sc.nextFloat();
        System.out.println("Nhập chiều rộng");
        rong = sc.nextFloat();
    } 
    public void ChuVi(){
        System.out.println("Chu vi hình chữ nhật là: "+ (dai+rong)*2);
    }
    public void DienTich(){
        System.out.println("Diện tích hình chữ nhật là: "+ dai*rong);
    }
    public static void main(String[] args) {
        Rectangle_Bai6 cn = new Rectangle_Bai6();
        cn.Nhap();
        cn.ChuVi();
        cn.DienTich();
    }
}