/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttaptech;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class HocBong {
    private boolean HDSE;
    private float diemTK;
    private boolean noiquy;
    private boolean frist;
    
    public boolean isHDSE() {
        return true;
    }

    public float getDiemTK() {
        return diemTK;
    }

    public boolean isNoiquy() {
        return true;
    }

    public boolean isFrist() {
        return frist;
    }
    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }

    
    public HocBong() {
    }
    
    public HocBong(boolean HDSE, float diemTK, boolean noiquy, boolean frist) {
        this.HDSE = HDSE;
        this.diemTK = diemTK;
        this.noiquy = noiquy;
        this.frist = frist;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Học viên có đăng kí khóa học HDSE hay ko");
        int hdse = sc.nextInt();
        this.HDSE = hdse == 1 ? true : false;
        System.out.println("Nhập điểm tổng kết của học viên");
        diemTK = sc.nextFloat();
        System.out.println("Học viên không vi phạm nội quy ");
        int noiquy = sc.nextInt();
        this.noiquy = noiquy ==1 ? true : false;
        System.out.println("Học viên trong các kì thi chỉ thi lần đầu tiên");
        int thi = sc.nextInt();
        this.frist = thi == 1 ? true : false;
    }
    
}
