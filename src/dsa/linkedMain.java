/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author GC
 */
public class linkedMain {
    public static void main (String[] args){
        linkedList list = new linkedList();
        list.insert(5);
        list.insert(10);
        list.insert(10);
        System.out.println(list);
        System.out.println(list.sumofAll());
        System.out.println(list.indexOf(5));
    }
}
