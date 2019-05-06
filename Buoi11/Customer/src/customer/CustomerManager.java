/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Thu Uyên
 */
public class CustomerManager {
     private String dir = "cust.dat";
     private List<Customer> list;

    public CustomerManager() {
        this.list = new ArrayList<>();
    }
    public boolean loat(String file){//
        try {// đọc file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Customer> data = (List<Customer>) ois.readObject();
            this.list = data;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        Customer cus = new Customer();
        System.out.println("ID: ");
        cus.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Name: ");
        cus.setName(sc.nextLine());
        System.out.println("Address: ");
        cus.setAddress(sc.nextLine());
        System.out.println("Age: ");
        cus.setAge(Integer.parseInt(sc.nextLine()));
        this.list.add(cus);
    }
    public Customer search(int id){
        for (Customer customer : list) {
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }
    public boolean save(){
        try {// ghi file
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
    