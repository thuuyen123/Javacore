/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapslide7;

import java.util.Scanner;
//trong hàm product phải có hàm printf info cả trong camera và smartphone
//
/**
 *
 * @author Thu Uyên
 */

public class Store{
    public Product[] products;
    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong san pham: ");
        int n = sc.nextInt();
        products = new Product[n];
        for(int i=0;i<n;i++){
            products[i] = addProduct();
        }
    }
    public void prinInfo(){
        for(int i=0;i<products.length;i++){
            products[i].prinInfo();
        }
    }
    
    public Product addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai san pham:");
        System.out.println("1.SmartPhone");
        System.out.println("2.Camera");
        System.out.println("Nhap lựa chon: ");
        int choice = sc.nextInt();
        sc.nextLine();
        Product product = null;
        switch(choice){
            case 1:{
                product = new SmartPhone();
                break;
            }
            case 2:{
                product = new Camera();
                break;
            }
        }
        product.addNew();
        return product;
    }
    public static void main(String[] args) {
        Store s = new Store();
        s.start();
        s.prinInfo();
    }
    
}
