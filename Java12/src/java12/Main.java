/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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
        Set<Integer> myset = new TreeSet<>();// tree set sẽ sắp xếp luôn
        
     //   Set<Integer> myset = new HashSet<>(); 
        myset.add(1);
        myset.add(232);
        myset.add(2111);
        myset.add(2);
        myset.add(3);
        myset.add(3);
        System.out.println(myset.size());
        System.out.println("///////////////////");
        Iterator<Integer> iterator =  myset.iterator();
//trả về 1 đối tượng có tên Interator. cho phép chúng ta có 1 số phương thức để duyệt
//       Integer next1 = integer.next();
//       Integer next2 = integer.next();
//       Integer next3 = integer.next();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
    
}
