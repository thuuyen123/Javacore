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
    Student st = new Student();
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
                    System.out.print("Order(Y/N): ");
                    sc.nextLine();
                    String a=sc.nextLine();
                    
                    if(a.equals("Y")== true){
                        System.out.print("ASC/DESC(A/D): ");
                        String b= sc.nextLine();
                        manager.list(true);
                    } 
                    else{
                        manager.list(false);
                    }
                    break;
                }
                case 2:{
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    manager.search(name);
                    break;
                }
                case 3:{
                    System.out.println("----NEW STUDENT----");
                    if(manager.add(st)){
                         st.addNew();
                         System.out.println("--------------------");
                         System.out.println("success!!");
                    }
                    else System.out.println("unsuccessful!!");
                    break;
                }
                case 4:{
                    break;
                }
            }
    }while(choice !=4);
    }
}
