/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocvien;

import java.util.Scanner;

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
            System.out.println(e.getMessage());
            return this.inputId();
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
        
        return tempMark;
    }
    
    public String inputPhone() {
        String tempPhone = this.scanner.nextLine();
        //Kiem tra dieu kien
//        if (tempPhone.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$"))
        return tempPhone;
    }
            
}

