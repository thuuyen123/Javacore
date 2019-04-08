/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class FileUtils {
    File file = new File("F:\\NetBeans\\");
    File[] files = file.listFiles();
    Scanner sc = new Scanner(System.in);
  
    public void Folder(){
       
        for (File file : files) {
            if(file.isDirectory()){
                System.out.println(file.getPath());
            } 
         }
    }
    public void file(){
        
        for (File file : files) {
            if(!file.isDirectory())
                System.out.println(file.getPath());
            }
        }
        
    
    public void fileAnh(){
        int dem = 0;
        for (File file : files) {
            if(file.getName().endsWith(".jpg") || file.getName().endsWith(".png")|| file.getName().endsWith(".jpeg")){
                System.out.println(file.getPath());
                dem++;
            }
            
        }
        if(dem == 0 ) System.out.println("Khong  co file nay");
    }
    public void fileMR(){
        int dem = 0;
        System.out.println("Nhap duoi file mo rong");
        String  exe = sc.nextLine();
        System.out.println("Nhap path:");
        String path = sc.nextLine();
        File filess = new File(path);
        File[] filel = filess.listFiles();
        for (File file : filel) {
            if(file.getName().endsWith(exe)){
                System.out.println(file.getPath());
                dem++;
            }
        }
        if(dem == 0 ) System.out.println("Khong  co file nay");
    }
    public void Time(){
        System.out.println("Nhap path:");
        String path = sc.nextLine();
        File filess = new File(path);
        File[] filel = filess.listFiles();
        if(filess.exists()){
            for (File file : filel) {
            System.out.println(file.lastModified());
            }
        }
        else{
            System.out.println("Path ko ton tai");
            System.out.println("Nhap lai");
            Time();
        }
//        for (File file : filel) {
//            System.out.println(file.lastModified());
//        }
    }
//    public void Size(){
//        for (File file : files) {
//            System.out.println(fi);
//        }
 //   }
}
