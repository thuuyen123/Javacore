/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java12_student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class StudentManager {
    private String dir = "Student.dat";
    private List<Student> list;

    public StudentManager() {
    }
    
    
    public StudentManager(List<Student> list) {
        this.list = new ArrayList<>();
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        System.out.println("Rollnumber: ");
        std.setRollnumber(sc.nextLine());
        System.out.println("Name: ");
        std.setName(sc.nextLine());
        System.out.println("Dod: ");
        std.getDob().getTime();
        System.out.println("Email: ");
        std.setEmail(sc.nextLine());
    }
    public Student search(String name){
        for (Student student : list) {
            if(student.getName().equals(name))
                System.out.println("nhap ten");
                student.setName(name);
                return student;
        }
        return null;
    }
    public Student capNhat(String name){
        Scanner sc = new Scanner(System.in);
        for (Student st : list) {
            if(st.getName().equals(name)){
                System.out.println("Nhap rollnumber:");
                st.setRollnumber(sc.nextLine());
                System.out.println("Nhap ten: ");
                st.setName(sc.nextLine());
                System.out.println("Nhap email: ");
                st.setEmail(sc.nextLine());
            }
            return st;
        }
        return null;
    }
    public void delete(Student student){
        for (Student st : list) {
            if(st.equals(student)) list.remove(st);
        }
    }
    public void Luu(String file){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void read(String file){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Student> data = (List<Student>) ois.readObject();
            this.list = data;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public void delete(String name){
//        for (Student student : list) {
//            if(student.getName().equals(name))
//                
//        }
//    }
//    public 
    
}
