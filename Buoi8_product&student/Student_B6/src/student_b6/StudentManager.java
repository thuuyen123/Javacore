/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_b6;

/**
 *
 * @author Thu Uyên
 */
public class StudentManager extends Student {
    private static final int MAX_STUDENT = 20;
    private Student[] listStudents;
    private int currQuantity;
    public StudentManager(){
        this.listStudents = new Student[MAX_STUDENT];
        this.currQuantity =0;
    }
    
    public boolean add(Student stud){
        if(currQuantity < StudentManager.MAX_STUDENT){
            this.listStudents[this.currQuantity] = stud;
            this.currQuantity++;
            return true;
        }
        else{
            return false;
        }
    }
    public void search(String name){
        boolean k =false; 
        for (int i = 0; i < this.listStudents.length; i++) {
            Student temp = this.listStudents[i];
            if(temp.getName().equals(name)){
                System.out.println(temp);
                k = true;
            }
            
        }
        if(k == false) System.out.println("Khong tim thay");
    }
    public void list(){
        for (Student student : listStudents) {
             if(student != null)
                System.out.println(student);
        }
    }
    public void list(boolean order){
        if(order){
            //sx tang dan theo ten
            for (int i = 0; i < this.listStudents.length-1; i++) {
                for (int j = 0; j < this.listStudents.length; j++) {
                    if(this.listStudents[i].getName().compareTo(this.listStudents[j].getName()) > 0 ){
                        Student temp = this.listStudents[i];
                        this.listStudents[i] = this.listStudents[j];
                        this.listStudents[j] = temp;
                    }
                }
            }
        }else{
            //sx giam dan theo ten
            for (int i = 0; i < this.listStudents.length-1; i++) {
                for (int j = 0; j < this.listStudents.length; j++) {
                    if(this.listStudents[i].getName().compareTo(this.listStudents[j].getName()) < 0 ){
                        Student temp = this.listStudents[i];
                        this.listStudents[i] = this.listStudents[j];
                        this.listStudents[j] = temp;
                    }
                }
            }
        }
        
    }
        
}
