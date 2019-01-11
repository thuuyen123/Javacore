/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapslide7;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Store{
    public Product[] products;
    private String sp;
    public void addProduct(){
        
        Scanner sc= new Scanner(System.in); 
        System.out.println("Nhap san pham: ");
        this.sp = sc.nextLine();
       
        
        
    }
    
}
