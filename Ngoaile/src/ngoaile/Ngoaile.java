/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoaile;

/**
 *
 * @author Thu Uyên
 */
public class Ngoaile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int x=1/0;
            System.out.println(x);
        }catch(Exception e){
            System.out.println("");
        }
            
    }
    
}
