/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocvien;

import java.util.Scanner;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author Thu Uyên
 */

   public class Input {
 

       
       private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    
    public String inputId() { 
        String tempId = this.scanner.nextLine();
        try {
            if (!tempId.matches("HV[0-9]{3}")) 
                throw new Exception("Phải bắt đầu bằng HV và 3 số:");
        } catch (Exception e) {
            System.out.println("Sai định đạng");
            System.out.println(e.getMessage());//getMessage là tên của ngoại lệ
            return this.inputId();// đệ quy
        }
        return tempId;
    }
    
    public String inputName() {
        String tempName = this.scanner.nextLine();
        //Kiem tra dieu kien
        try {
            if (tempName.length() < 8) throw new Exception("Tên phải lớn hơn 8 ký tự");
        } catch (Exception e) {
            System.out.println("Sai định dạng");
            System.out.println(e.getMessage());
            return this.inputName();
        }
        return tempName;
    }
    
    public double inputMark() {
        double tempMark = Double.parseDouble(this.scanner.nextLine());
        //Kiem tra dieu kien
        try {
            if(tempMark >10 || tempMark < 1) throw  new Exception("Điểm phải <= 10 và >= 1");
        } catch (Exception e) {
            System.out.println("Sai định dạng");
            System.out.println(e.getMessage());
            return this.inputMark();
        }
        return tempMark;
    }
    
    public String inputPhone() {
        String tempPhone = this.scanner.nextLine();
        //Kiem tra dieu kien
        try {
            if(tempPhone.length()!=10 || tempPhone.charAt(0) != '0' ) throw  new Exception("Số điện thoại phải có 10 số và số đầu tiên lá 0");
        } catch (Exception e) {
            System.out.println("Sai định dạng");
            System.out.println(e.getMessage());
            return this.inputPhone();
        }
        return tempPhone;
    }
            
}

