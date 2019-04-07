/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;

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
        File f = new File("F:\\Java\\test.txt");
        if(f.exists()){
            if(f.isFile()){
                System.out.println(f.getPath());
                System.out.println(f.renameTo(f));
               
            }
         
        }
        else {
            System.out.println("file ko ton tai");
             
           
        }
    }
    
}
