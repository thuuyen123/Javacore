/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Customer implements Serializable{
    private int id;
    private String name;
    private String address;
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public void Init(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Id: ");
//        setId(sc.nextInt());
//        System.out.println("Name: ");
//        setName(sc.nextLine());
//        System.out.println("Address: ");
//        setAddress(sc.nextLine());
//        System.out.println("Age: ");
//        setAge(sc.nextInt());
//    }

 
    @Override
    public boolean equals(Object obj) {// mục đích của hàm equals là gì?
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }

    
    
}
