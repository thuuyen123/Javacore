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
        System.out.println("Sim: "+ sim);
    }
    
}
//	private boolean hasCamera;
//    private int sim;
//    public SmartPhone(){
//    	super();
//    }
//    public SmartPhone(int id,String name,boolean hasCamera,int sim){
//    	super(id,name)//sử dụng lại code của phương thức lớp cha tương ứng
//        this.hasCamera = hasCamera;
//        this.sim = sim;
//    }
//    @Override
//    public void addNew(){
//    	super();
//    	Scanner sc = new Scanner(System.in);
//        System.out.println("nhap hasCamera:(1/0)");
//        int choice = sc.nextInt();
//        this.hasCamera = choice == 1 ?  true: false;
//        System.out.println("nhap sim:");
//		this.sim = sc.nextInt();
//    }
//}
//class Product{
//	private int id;
//    private String name;
//    
//    public Product(){}
//    
//    public Product(int id,String name){
//    	this.id  = id;
//        this.name = name;
//    }
//    
//    public get/Set...
//   
//   	public void addNew(){
//    	Scanner sc = new Scanner(System.in);
//        System.out.println("nhap id");
//        this.id = sc.nextInt();
//        System.out.println("nhap name");
//        this.name = sc.nextLine();
//    }

  
    
        
    
