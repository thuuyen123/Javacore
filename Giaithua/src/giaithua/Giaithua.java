/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaithua;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Giaithua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int n = gt.nextInt();
        long gthua=1;
        for(int i = 1;i<= n; i++){
            gthua = gthua *i;
        }
        System.out.printf("%d", gthua);
        
        // TODO code application logic here
    }
    
}
