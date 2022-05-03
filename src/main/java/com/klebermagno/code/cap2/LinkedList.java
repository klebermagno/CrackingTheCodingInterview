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

    public static LinkedList deleteByKey(LinkedList list, int key){

        Node current = list.head;
        Node previus = null;
        if(current !=null && current.data==key) {
            System.out.println("Key found!");
            list.head = null;
            return list;
        }
        while(current!=null && current.data !=key){
            previus = current;
            current = current.next;
        }
        if(current.data == key){
            previus.next = current.next;
            System.out.println("Found iten: "+key);
        }
        if(current==null)
            System.out.println("Key don't found!");
        return list;
    }

    public static LinkedList deleteAtPosition(LinkedList list,int pos){
        Node current = list.head;
        Node previous = null;
        int index = 0;
        if(current == null){
            System.out.println("Position not found!");
            return list;
        }
        if(pos == 0){
            list.head = current.next;
            return list;
        }
        while(current != null){
            if(pos == index){
                previous.next = current.next;
                return list;
            }else {
                previous = current;
                current = current.next;
                index++;
            }
        }
        if(current==null){
            System.out.println("Position not found!");
        }
        return list;
    }
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list = LinkedList.insert(list, 9);
        list = LinkedList.insert(list, 8);
        list = LinkedList.insert(list, 7);
        list = LinkedList.insert(list, 6);
        list = LinkedList.insert(list, 5);
        LinkedList.printList(list);
        deleteByKey(list, 7);
        printList(list);
        deleteAtPosition(list,10);
        printList(list);
    }


}

