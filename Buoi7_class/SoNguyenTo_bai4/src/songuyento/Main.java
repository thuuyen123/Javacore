/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        SoNguyenTo snt = new SoNguyenTo();
        System.out.println("Nhập số x:");
        int x = sc.nextInt();
        snt.SoNguyenTo(x);
        
        if(snt.timSoNguyenToTiepTheo() ==0) System.out.println("a kxd nên bỏ");
        else System.out.println("Số nguyên tố tiếp theo của a là "+snt.timSoNguyenToTiepTheo());
        
        
    }
}
