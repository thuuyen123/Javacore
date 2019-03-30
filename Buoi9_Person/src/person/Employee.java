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
public class Employee extends Person{//nhân viên
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name,double salary) {
        super(id, name);
        this.salary = salary;
    }

    public Employee() {
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void input(){
        super.input();
        System.out.println("Nhập lương: ");
        setSalary(sc.nextDouble());
    }
    @Override
    public String toString(){
        return "Student{id= "+this.getId()+",name= "+this.getName()+"saraly "+ salary + "}";
    }
}
