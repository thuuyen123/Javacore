/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mu;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Mu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mu = new Scanner(System.in );
        System.out.print("Nhap so > ");
        int x = mu.nextInt();
        System.out.println("Ket qua");
        System.out.printf("%d^2 = %d", x, x*x );
        // TODO code application logic here
    }
    
}
