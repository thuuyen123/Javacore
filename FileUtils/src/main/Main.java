/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
        FileUtils fu = new FileUtils();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Lay ra folder");
            System.out.println("2.Lay ra file");
            System.out.println("3.Lay ra file anh");
            System.out.println("4.Lay ra file co phan mr exe");
            System.out.println("5.Lay ra thoi gian cap nhat");
            System.out.println("6.In ra kich thuoc file");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    fu.Folder();
                    break;
                 case 2:
                    fu.file();
                    break;
                case 3:
                    fu.fileAnh();
                    break;
                 case 4:
                    fu.fileMR();
                    break;
                 case 5:
                    fu.Time();
                    break;
            }
        }while(choice < 6);
    }
    
}
