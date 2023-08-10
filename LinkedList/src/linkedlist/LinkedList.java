/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

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

public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            head = node;
        } else {
            Node current = head;
            while(current.next !=null){
                current = current.next;
            }
            current.next = node;
        }
    }

}

// insert (4)
