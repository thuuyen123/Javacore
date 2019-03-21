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
public class Camera extends Product {
    private boolean hasWifi;
    
    public boolean getHasWifi(){
        return true;
    }
    public Camera(){
        super();
    }
    public Camera(int id, String name, double price, int quantity, boolean hasWifi){
        super(id, name, price, quantity);
        this.hasWifi= hasWifi;
    }

    
    @Override
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hasWifi: ");
        int choise = sc.nextInt();
        if( choise== 1) this.hasWifi = true;
        else this.hasWifi = false;
             
        
    }
    @Override
    public void prinInfo(){
        super.prinInfo();
        if(this.hasWifi == true) System.out.println("Co wifi");
        else System.out.println("ko co wifi");
    }
    
}
