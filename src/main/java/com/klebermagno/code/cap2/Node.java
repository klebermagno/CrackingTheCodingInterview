package com.klebermagno.code.cap2;

public class Node {
    private Node next = null;
    int data;

    public Node(int data){
        this.data=data;

    }

    public void appendToTail(int data){
        Node end = new Node(data);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;

    }

    public void deleteNode(Node head, int value){

    }

}
