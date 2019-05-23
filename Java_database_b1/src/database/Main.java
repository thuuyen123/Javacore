/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        while(true){
            try {
                Process pr = new Process();
                Scanner sc= new Scanner (System.in);
                System.out.println("=====MENU===========");
                System.out.println("1.EX6_Tìm đọc giả mượn sách toán vào ngày 1/1/2018");
                System.out.println("2.EX7-Hiển thị tên danh sách của tất cả các đọc giả mượn sách tháng 1/2018");
                System.out.println("3.EX8-DS các sách ko ai mượn");
                System.out.println("4.EX9-Cho biết đọc giả tên Anh mượn sách bao nhiêu lần");
                System.out.println("5.EX10-danh sách tên , số thể các độc giả chưa trả sách");
                System.out.println("0.THoat");
                System.out.print("Ban chọn: ");
                 int choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 0:{
                        System.exit(0);
                        break;
                    }
                    case 1:{
                        System.out.println("Nhập tên sách: ");
                        String bookName = sc.nextLine();
                        System.out.println("Nhập ngày mượn(yyyy-mm-dd): ");
                        String date = sc.nextLine();
                        ResultSet rs = pr.ex6(bookName, date);
                        while(rs.next()){
                            System.out.println(rs.getString(1));
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Nhập ngày mượn(yyyy-mm-dd): ");
                        String dateStart = sc.nextLine();
                        System.out.println("Nhập ngày trả(yyyy-mm-dd): ");
                        String dateFinish = sc.nextLine();
                        ResultSet rs = pr.ex7(dateStart, dateFinish);
                        while(rs.next()){
                            System.out.println(rs.getString(1));
                        }
                        break;
                    }
                    case 3:{
                        ResultSet rs =  pr.ex8();
                        while(rs.next()){
                            System.out.println(rs.getString(1));
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("Nhập tên đọc giả: ");
                        String name = sc.nextLine();
                        ResultSet rs =pr.ex9(name);
                        while(rs.next()){
                            System.out.println(rs.getString(1));
                        }
                        break;
                    }
                    case 5:{
                        ResultSet rs = pr.ex10();
                        while(rs.next()){
                            System.out.println(rs.getString(1));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}   
