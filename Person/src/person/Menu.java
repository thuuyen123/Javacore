/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {
    private Manager manager = null;
    public Menu(Manager manager){
        this.manager = manager;
    }
    Scanner sc = new Scanner(System.in);
    public void display(){
        int choice;

        do{
            System.out.println("==========MENU==============");
            System.out.println("1.Add");
            System.out.println("2.Show");
            System.out.println("3.Search name");
            System.out.println("4.Exit");
            System.out.println("Choice(1-4): ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    this.manager.add();
                    break;
                case 2:
                    this.manager.show();
                    break;
                case 3:{
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    this.manager.search(name);
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
            }
         }while(choice <4 && choice > 0);
    }


}