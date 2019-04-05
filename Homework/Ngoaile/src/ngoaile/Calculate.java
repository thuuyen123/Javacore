/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoaile;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Calculate {
    Scanner sc = new Scanner(System.in);
    public int inputNumber(){

        int a= 0;
//        boolean tlag =
        try{
            System.out.println("Nhập số");
           a = Integer.parseInt(sc.nextLine());
        }catch(Exception e){
            System.out.println("Nhập sai đinh dạng");
            return this.inputNumber();
        }
        return a;
    }
 }
