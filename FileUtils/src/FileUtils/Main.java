/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileUtils;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileUtils f = new FileUtils();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Lay ra folder");
            System.out.println("2.Lay ra file");
            System.out.println("3.Lay ra file anh");
            System.out.println("4.Lay ra file co phan mr exe");
            System.out.println("5.Lay ra thoi gian cap nhat");
            System.out.println("6.In ra kich thuoc file");
            System.out.print("Ban chon: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                     File [] array = f.getFolderByPath("F:\\NetBeans\\");
                     if(array == null){
                        System.out.println("Đường dẫn ko tồn tại");
                    }else{
                        for (File file : array) {
                            if(file == null){
                                break;
                            }else{
                                System.out.println("Folder  "+ file.getName());
                            }

                        }
                    }
                    break;
                 case 2:
                    File [] a = f.getFileByPath("F:\\NetBeans\\");
                    if(a == null){
                        System.out.println("Đường dẫn ko tồn tại");
                    }else{
                        for (File file : a) {
                            if(file == null){
                                break;
                            }else{
                                System.out.println("File  "+ file.getName());
                            }

                        }
                    }
                    break;
                case 3:
                    File[] ar = f.getFileAnhByPath("F:\\NetBeans\\");
                    if(ar == null){
                        System.out.println("Đường dẫn ko tồn tại");
                    }else{
                        for(File file : ar){
                            if(file == null){
                                break;
                            }else{
                                System.out.println("File anh: "+file.getName());
                            }
                        }
                    }
                    break;
                 case 4:
                    
                    break;
                 case 5:
                    System.out.println("Nhap path");
                    sc.nextLine();
                    String patht = sc.nextLine();
  //                  fu.Time(patht);
                    break;
                 case 6:{
   //                  fu.Size();
                     break;
                 }}
        }while(choice < 7);
    }
    
 
}
