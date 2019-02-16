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
public class Bai1 {
    static String docHangChuc(int chuc){
        switch(chuc){
            case 1: return "Mười";
            case 2: return "Hai";
            case 3: return "Ba";
            case 4: return "Bốn";
            case 5: return "Năm";
            case 6: return "Sáu";
            case 7: return "Bảy";
            case 8: return "Tám";
            case 9: return "Chín";
            default:
                return "";
        }
        
    }
    static String docHangDonVi(int chuc, int donvi){
        switch(donvi){
            case 0: return chuc ==1 ? "" : "mươi";
            case 1: return chuc==1 ? "một" : "mươi mốt";
            case 2: return chuc==1 ? "hai" : "mươi hai";
            case 3: return chuc==1 ? "ba" : "mươi ba";
            case 4: return chuc==1 ? "bốn" : "mươi bốn";
            case 5: return chuc==1 ? "lăm" : "mươi lăm";
            case 6: return chuc==1 ? "sáu" : "mươi sáu";
            case 7: return chuc==1 ? "bảy" : "mươi bảy";
            case 8: return chuc==1 ? "tám" : "mươi tám";
            case 9: return chuc==1 ? "chín" : "mươi chín";
            default:
                return "";// ko viết gì cũng được
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số :");
        number = sc.nextInt();
        System.out.println("Cách đọc của số " + number +" là : " + docHangChuc(number/10)+" " + docHangDonVi(number/10,number%10));
    }
}
