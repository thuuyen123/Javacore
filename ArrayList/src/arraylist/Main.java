/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<String> list = new ArrayList();//chỉ đươc cho string vào trong array
       list.add("Hạnh");
        System.out.println(list.get(0));
        list.clear();
        System.out.println(list.size());
        list.add("Trinh thu uyen");
        list.add("uyen");
        System.out.println("mai");
        System.out.println(list.size());
//        list.trimToSize();
        System.out.println(list);
//        list.remove(list)
        list.remove(2);
        System.out.println(list);
        
    }
    
}
