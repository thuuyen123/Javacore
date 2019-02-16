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
class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;
    public boolean getHasCamera(){
        return true;
    }
    public SmartPhone(){
        super();
    }
    public SmartPhone(int id, String name, double price, int quantity, boolean hasCamera, int sim ){
        super(id,name,price,quantity);
        this.hasCamera=hasCamera;
        this.sim = sim;
    }
    @Override
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hasCamera: (1/0)");
        int choice = sc.nextInt();
        this.hasCamera = choice == 1 ? true : false;
        System.out.println("Nhap sim: ");
        int sim = sc.nextInt();
    }
    @Override
    public void prinInfo(){
        super.prinInfo();
        if(this.hasCamera ==true) System.out.println("Co camera");
        else System.out.println("Ko co camera");
        
        System.out.println("Sim: " + sim);
    }
    
}

