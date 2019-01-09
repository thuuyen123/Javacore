/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Student {
    private String maSV;
    private float diem;
    private int tuoi;
    private String lop;
    public Student(){
        
    }
    public Student(String maSV, float diem, int tuoi, String lop){
        this.maSV= maSV;
        this.diem= diem;
        this.tuoi=tuoi;
        this.lop=lop;
    }
    
    public String getMaSV(){
       return maSV;
     }
    public float getDiem(){
        return diem;
    }
    public int getTuoi(){
        return tuoi;
    }
    public String getLop(){
        return lop;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        // thieu dk chua 8 ky tu :v
        System.out.print("Nhap ma sinh vien: ");
        setMaSV(sc.nextLine()); 
        
        do{
            System.out.print("Nhap diem trung binh sinh vien: ");
            setDiem(sc.nextFloat()); 
        }while(diem < 0.0 || diem >10.0);
        do{
            System.out.print("Nhap tuoi: ");
            setTuoi(sc.nextInt());
        }while(tuoi < 18);
        //ko biet viet dieu kien :v
        sc.nextLine();
        System.out.print("NHap lop: ");
        setLop(sc.nextLine());
        
    }
    public void showInfo(){
        System.out.println("Ma SV : "+getMaSV());
        System.out.println("Diem trung binh : "+getDiem());
        System.out.println("Tuoi : "+getTuoi());
        System.out.println("Lop : "+getLop());
        
    }
    public void hocBong(){
        if(getDiem()> 8) System.out.println(" SV DUoc hoc bong");
        else System.out.println("SV Ko duoc hoc bong");
    }
    

    
     public static void main(String[] args) {
        // TODO code application logic here
        Student a = new Student();
        a.inputInfo();
        a.showInfo();
        a.hocBong();
        
    }

   
    
    
}
