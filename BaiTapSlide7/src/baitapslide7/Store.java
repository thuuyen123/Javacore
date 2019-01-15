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
    public void search(String name){
        for(int i=0;i<products.length;i++){
            if(products[i].getName().equals(name))
                products[i].prinInfo();
            else System.out.println("Không tồn tại sản phẩm cầm tìm");
        }
                
    }
    public static void main(String[] args) {
        Store s = new Store();
        Scanner sc = new Scanner(System.in);
        int lc;
         do{
            System.out.println("===========MENU============");
            System.out.println("1.Add Product");
            System.out.println("2.List Product");
            System.out.println("3.Seach");
            System.out.println("4.Exit");
            System.out.println("Ban chon: ");
        //    System("cls");
            lc = sc.nextInt();
            switch(lc){
                case 1:{
                    s.start();
                    break;
                }
                case 2:{
                    s.prinInfo();
                    break;
                }
                case 3:{
                    System.out.println("Nhap ten ban muon tim kiem: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    s.search(ten);
                    break;
                }
                case 4:
                    break;
            }
      
        }while(lc>0); 
    }
}
