/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_b6;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
    StudentManager manager = new StudentManager();
    Scanner sc = new Scanner(System.in);
    int choice;
    do{
            System.out.println("---Student Manager---");
            System.out.println("1.  List");
            System.out.println("2.  Search");
            System.out.println("3.  Add");
            System.out.println("4.  Exit");
            System.out.println("Choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
            }
    }while(choice !=4);
    }
}
