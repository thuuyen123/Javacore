/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5chuabai;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Bai2 {
     static String docHangTram(int tram){
        switch(tram){
            case 1: return "Một trăm";
            case 2: return "Hai trăm";
            case 3: return "Ba trăm";
            case 4: return "Bốn trăm";
            case 5: return "Năm trăm";
            case 6: return "Sáu trăm";
            case 7: return "Bảy trăm";
            case 8: return "Tám trăm";
            case 9: return "Chín trăm";
            default:
                return "";
        }
     }
      static String docHangChuc(int chuc, int donvi){
        switch(chuc){
            case 0: return donvi==0 ? "" : "linh";
            case 1: return "mười";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bốn";
            case 5: return "năm";
            case 6: return "sáu";
            case 7: return "bảy";
            case 8: return "tám";
            case 9: return "chín";
            default:
                return "";
        }
     }
      static String docHangDonVi(int chuc, int donvi){
        switch(donvi){
            case 0: return (chuc==0 || chuc==1) ? "" : "mươi";
            case 1: return (chuc==0 || chuc==1) ? "một" : "mốt";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bốn";
            case 5: return "năm";
            case 6: return "sáu";
            case 7: return "bảy";
            case 8: return "tám";
            case 9: return "chín";
            default:
                return "";
        }
     }
     public static void main(String[] args) {
        System.out.println("Nhap so: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Cách đọc của số "+ number + " là: "+ docHangTram(number/100)+" " + docHangChuc((number%100)/10, number%100%10)+ " " + docHangDonVi((number%100)/10, number%100%10));

    }
}
