/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Thu Uyên
 */
public class MainMap {
    public static void main(String[] args) {
        Map<Integer , String>  map = new HashMap<>();
        map.put(0, "hello");
        map.put(1, "aaa");
        Set<Integer> keySet = map.keySet();
//        Iterator<String> key = keySet.iterator();
        
    }
}
