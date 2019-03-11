/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_bai7;

/**
 *
 * @author Thu Uyên
 */
public class Preson {
    private String name;
    private int age;
    public Preson(){
        this.name ="";
        this.age = 0;
    }
    public Preson(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    
    }
   // @Override
//    public String toString(){
//        
//    }
    
}
