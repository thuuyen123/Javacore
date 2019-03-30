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
public class Student extends Person {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student() {
    }

    public Student( int id, String name,String email) {
        super(id, name);
        this.email = email;
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void input(){
        super.input();
        System.out.println("Nhập email: ");
        setEmail(sc.nextLine());
    }
    @Override
    public String toString(){
       return "Student{id= "+this.getId()+",name= "+this.getName()+"email "+ email + "}";

    }
}
