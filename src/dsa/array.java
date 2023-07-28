/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GC
 */
public class array {
     public static void main(String[] args) {
        // TODO code application logic here
         List<Integer> arr = new ArrayList<>();
         arr.add(1);
         arr.add(3);
         System.out.println(arr);
         
         arrayListManually alm = new arrayListManually(5);
         alm.insert(4);
         
         alm.insert(9);
         alm.insert(10);
         alm.insert(12);
         alm.insert(3);
         alm.removeByIndex(1);
         System.out.println(alm);
    }
}
