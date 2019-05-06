/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java12_student;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManager mana = new StudentManager();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Them moi");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Cap nhat");
            System.out.println("4. Xoa");
            System.out.println("5. Luu vao file");
            System.out.println("6. Doc du lieu tu file");
            System.out.println("7. THoat");
            System.out.println("Chon:  ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:{
                    mana.add();
                    break;
                }
                case 2:{
                    String name = sc.nextLine();
                    mana.search(name);
                    break;
                }
                case 3:{
                    String name = sc.nextLine();
                    mana.capNhat(name);
                    break;
                }
                case 4:{
                    Student student = new Student("1", "Mai",Date.from(Instant.MIN) , "mai.gmail");
                    mana.delete(student);
                    break;
                }
                case 5:{
//                    String file
                }
            }
        }
    }
    
}
