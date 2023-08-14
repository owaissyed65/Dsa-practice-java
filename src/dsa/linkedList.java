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
class Node {

    public int data;
    public Node next = null;

    Node(int value) {
        this.data = value;
    }
}

public class linkedList {

    private Node head;
    private Node tail;

    public linkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            head = node;
            tail = node;
        } else {
//            Node current = head;

//            while (current.next != null) {  /* O(n)*/
//                current = current.next;
//            }
//            current.next = node;
            tail.next = node;
            tail = node;
        }
    }
    public void insertAtFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
    }
    public int sumofAll() {
        Node current = head;
        int sum = 0;
        while (current.next != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    public int indexOf(int value) {
        int index = 0;
        Node current = head;
        while (current.next != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

}
