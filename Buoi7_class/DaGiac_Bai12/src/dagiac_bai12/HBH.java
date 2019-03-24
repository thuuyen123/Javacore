/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dagiac_bai12;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class HBH extends Polyon{
    private int canhben;
    private int canhday;
    private int chieucao;

    public int getCanhben() {
        return canhben;
    }

    public void setCanhben(int canhben) {
        this.canhben = canhben;
    }

    public int getCanhday() {
        return canhday;
    }

    public void setCanhday(int canhday) {
        this.canhday = canhday;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }

    public HBH(int canhben, int canhday, int chieucao) {
        this.canhben = canhben;
        this.canhday = canhday;
        this.chieucao = chieucao;
    }

    public HBH() {
    }
    
    @Override
    public void area() {
      double dientich = this.canhday*this.chieucao;
        System.out.println("Diện tích hình bình hành là "+ dientich);
    }

    @Override
    public void Chuvi() {
        int chuvi = (this.canhben+this.canhday)*2;
        System.out.println("Chu vi hình bình hành:" + chuvi );
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh bên:");
        setCanhben(sc.nextInt());
        System.out.println("Nhập cạnh đáy:");
        setCanhday(sc.nextInt());
        System.out.println("Nhập chiều cao: ");
        setChieucao(sc.nextInt());
    }
   

   
    
}
