/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sophuc_bai8;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SoPhuc {
    private float thuc;
    private float ao;

    public SoPhuc() {
    }

    public SoPhuc(float thuc, float ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public float getThuc() {
        return thuc;
    }

    public void setThuc(float thuc) {
        this.thuc = thuc;
    }

    public float getAo() {
        return ao;
    }

    public void setAo(float ao) {
        this.ao = ao;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần thực");
        this.thuc = sc.nextFloat();
        System.out.println("Nhập phần ảo");
        this.ao = sc.nextFloat();
    }
    public void Xuat(){

        if(ao>= 0) System.out.println(thuc+"+"+ao+"i");
        else System.out.println(thuc+ao+"i");
    }
    public SoPhuc cong (SoPhuc sp){
        SoPhuc tong = new SoPhuc();
        tong.thuc = this.thuc + sp.thuc;
        tong.ao = this.ao + sp.ao;
        return tong;
    }
    public SoPhuc tru(SoPhuc sp){
        SoPhuc hieu = new SoPhuc();
        hieu.thuc = this.thuc - sp.thuc;
        hieu.ao = this.ao - sp.ao;
        return hieu;
    }
    public SoPhuc nhan (SoPhuc sp){
        SoPhuc tich = new SoPhuc();
        tich.thuc = this.thuc*sp.getThuc()- this.ao*sp.getAo();
        tich.ao = this.thuc*sp.getAo()+ this.ao*sp.getThuc();
        return tich;
    }
    public SoPhuc chia (SoPhuc sp){
        SoPhuc thuong = new SoPhuc();
        thuong.thuc = (this.thuc*sp.getThuc() + this.ao*sp.getAo())/(sp.getThuc()*sp.getThuc()+sp.getAo()*sp.getAo());
        thuong.ao = (this.ao*sp.getThuc()-this.thuc*sp.getAo())/(sp.getThuc()*sp.getThuc()+sp.getAo()*sp.getAo());
        return thuong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoPhuc sp1 = new SoPhuc();
        System.out.println("Nhập số phức thứ nhất");
        sp1.Nhap();
        SoPhuc sp2 = new SoPhuc();
        System.out.println("Nhập số phức thứ hai");
        sp2.Nhap();
        int lc;
        do{
            System.out.println("=============Menu=============");
            System.out.println("0.Thoát");
            System.out.println("1.Số phức vừa nhập là: ");
            System.out.println("2.Cộng hai số phức");
            System.out.println("3.Trừ hai số phức");
            System.out.println("4.Nhân hai sô phức");
            System.out.println("5.Chia hai số phức");
            System.out.println("Mời bạn chọn: ");
            lc = sc.nextInt();
            switch(lc){
                case 0:{
                    break;
                }
                case 1:{
                    System.out.println("Số phức thứ nhất");
                    sp1.Xuat();
                    System.out.println("Số phức thứ 2:");
                    sp2.Xuat();
                    break;
                }
                case 2:{
                    SoPhuc tong;
                    tong = sp1.cong(sp2);
                    tong.Xuat();
                    break;
                }
                case 3:{
                    SoPhuc tru;
                    tru = sp1.tru(sp2);
                    tru.Xuat();
                    break;
                }
                case 4:{
                    SoPhuc tich;
                    tich = sp1.nhan(sp2);
                    tich.Xuat();
                    break;
                    
                }
                case 5:{
                    SoPhuc thuong;
                    thuong = sp1.chia(sp2);
                    thuong.Xuat();
                    break;
                }
                
            }
            if(lc ==0) break;
        }while(lc>=0 && lc <6);
                
        
    }
}
