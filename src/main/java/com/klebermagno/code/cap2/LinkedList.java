package com.klebermagno.code.cap2;

public class LinkedList {

    Node head;

    static class Node{
        int data;

        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static LinkedList insert(LinkedList list, int data){

        Node newNode = new Node(data);
        newNode.next = null;
        if(list.head==null) {
            list.head = newNode;
        }
        else {
            Node last = list.head;
            while (last.next!=null){
                last = last.next;
            }
            last.next = newNode;

        }
        return list;
    }

    public static void printList(LinkedList list){
        Node node = list.head;
        System.out.println("LinkedList: ");
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list = LinkedList.insert(list, 9);
        list = LinkedList.insert(list, 8);
        list = LinkedList.insert(list, 7);
        list = LinkedList.insert(list, 6);
        list = LinkedList.insert(list, 5);
        LinkedList.printList(list);
    }


}

