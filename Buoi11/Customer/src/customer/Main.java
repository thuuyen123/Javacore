/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

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
        CustomerManager manager = new CustomerManager();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Loat");
            System.out.println("2. Add");
            System.out.println("3. Save");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Choose >");
            int c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 1:
                    System.out.println("File path >");
                    String path = sc.nextLine();
                    if(manager.loat(path)){
                        System.out.println("Thanh cong");
                    }else{
                        System.out.println("ERROR");
                    }
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    if(manager.save()){
                        System.out.println("Thanh cong");
                    }else{
                        System.out.println("ERROR");
                    }
                    break;
                case 4:
                    System.out.println("ID>");
                    int id = Integer.parseInt(sc.nextLine());
                    Customer cust = manager.search(id);
                    if(cust != null){
                        System.out.println(cust);
                    }else{
                        System.out.println("Not found");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not valid");
            }
        }
        
    }
    
}
