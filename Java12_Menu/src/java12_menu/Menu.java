/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java12_menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {
    
    private Map<String, String> map;
    public Menu(){
        this.map = new HashMap<>();
        this.loatData("vi");//"en" có nghĩa là English còn "vn" là VNam
    }
    public void loatData(String lang){
        try {
            String fileName = "menu-" +lang +".locate";
            BufferedReader reader = new BufferedReader(//buffer dùng để đọc dòng dữ liêu từ file thay vì scanner
                    new InputStreamReader(
                            new FileInputStream(fileName)));
            this.map.clear();
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                String[] split = line.split("=");// readLine để đọc dữ liệu từ file_ và trả về chuỗi
                this.map.put(split[0], split[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void print(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf("\n---------%s----------", this.map.get("menu"));
            System.out.printf("\n1. %s", this.map.get("add"));
            System.out.printf("\n2. %s", this.map.get("search"));
            System.out.printf("\n3. %s", this.map.get("update"));
            System.out.printf("\n4. %s", this.map.get("delete"));
            System.out.printf("\n5. %s", this.map.get("save"));
            System.out.printf("\n6. %s", this.map.get("lang"));
            System.out.printf("\n7. %s", this.map.get("exit"));
            System.out.printf("\n. %s", this.map.get("choice"));
            int  c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    System.out.println(this.map.get("mess"));
                    int la = Integer.parseInt(sc.nextLine());
                    if(la == 1) this.loatData("en");
                    else if(la==2) this.loatData("vi");
                    else if(la==3) this.loatData("jp");
                    break;
                }
                case 7:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Not vaild");
            
            }
        }
    }
}
