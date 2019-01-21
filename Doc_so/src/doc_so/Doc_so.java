/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_so;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Doc_so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = sc.nextInt();
        int temp;
        int count =0;
        while(n>0){
            temp = n%10;
            n/=10;
            count++;
            System.out.print("Giá trị " + temp + " là ");
            if(count ==1) System.out.println("Hàng đơn vị");
            if(count ==2 ) System.out.println("Hàng chục");
            if(count ==3 ) System.out.println("Hàng trăm");
        }
      
    }
    
}
