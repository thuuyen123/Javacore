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
public class Student{
    
    private String name;
    private String email;
    private int age;

    public Student() {
    }
    
    
    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", age=" + age + '}';
    }
    Scanner sc = new Scanner(System.in);
    public void addNew(){
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("EMAIL: ");
        email = sc.nextLine();
        System.out.print("AGE: ");
        age = sc.nextInt();
    }
     public void list(){
        System.out.println("+=====+==============+=======+");
        System.out.println("|NAME | EMAIL        |AGE    |");
        System.out.println("+=====+==============+=======+");
        System.out.printf("|%5s|%14s|%7d|\n",name, email,age);
        System.out.println("+-----+--------------+-------+");
    }
}
