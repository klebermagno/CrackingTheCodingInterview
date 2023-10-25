package com.klebermagno.code.cap2;

/**
 * Linkedlist 
 */
public interface SingleLinkedList<E> {

    int size();
    boolean isEmpty();

    /* Complexity O(1) */
    void addFirst(E element);

    /* O(n) */
    void addLast(E element);

    /* O(1) */
    E removeFirst();

    /* O(n) */
    E removeLast();

    /*O(n) */
    E removeElement(E element);

    /*O(1) */
    E getFirst();

    /*O(n) */
    E getLast();

    void clear();

    /*O(n) */
    boolean contains(E element);

    public static void maind(String[] args){
        SingleLinkedList<Integer> linkedList = new SingleLinkedListImpl<Integer>();
        linkedList.addFirst(1);
    }
}
class Node<E> {
    Node<E> next;
    E element;

    public Node(E element){
        this.element = element;
    }
}

class SingleLinkedListImpl<E> implements SingleLinkedList<E> {

    Node<E> head;

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public void addFirst(E element){}

    public void addLast(E element){}

    public E removeFirst(){
        return null;
    }

    public E removeLast(){
        return null;
    }

    public E removeElement(E element){
        return null;
    }

    public E getFirst(){
        return null;
    }
    
    public E getLast(){
        return null;
    }

    public void clear(){}

    public boolean contains(E element){
        return false;
    }
}
