/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmang2c;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Mang2c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mang2chieu mang = new Mang2chieu();
        Scanner sc = new Scanner(System.in);
        int lc;
        mang.nhapMangA();
        do{
            System.out.println("Chọn thao tác");
            System.out.println("1.Tính tổng mỗi hàng của ma trận");
            System.out.println("2.TÍnh tổng mỗi cột của ma trận");
            System.out.println("3.Tính tổng hai ma trận");
            System.out.println("4.Tính tích 2 ma trận");
            System.out.println("5.Kiểm tra ma trận trên có phải là ma trận đơn vị hay ko?");
            System.out.println("6.Kiểm tra ma trận trên có phải là ma trận không hay ko?");
            System.out.println("7.Kiểm tra ma trân tren có phải là ma trận đối xứng hay không");
            System.out.println("8.Thoát");
            System.out.println("Mời bạn nhập lựa chọn:");
            lc = sc.nextInt();
            switch(lc){
                case 1:{
                    
                    mang.sumCol();
                    break;
                }
                case 2:{
                    
                    mang.sumRum();
                    break;
                }
                case 3:{
                    
                    mang.nhapMangB();
                    System.out.println("Mảng hết quả");
                    mang.sum2MT();
                    break;
                }
                case 4:{
                    
                    mang.nhapMangB();
                    mang.Tich2MT();
                    System.out.println("Mảng kết quả");
                    mang.Result();
                    break;
                }
                case 5:{
                    
                    mang.checkDV();
                    break;
                }
                case 6:{
                    
                    mang.checkKH();
                    break;
                }
                case 7:{
                    
                    mang.checkDX();
                    break;
                }
                case 8:{
                    break;
                }
            }
        }while(lc>0 && lc != 8);
    }
    
}
