package com.klebermagno.code.cap3;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private List<T> elements = new ArrayList<>();

    //enqueue
    public void enqueue(T element){
        elements.add(element);
    }

    public T dequeue(){
        if(elements==null || elements.isEmpty()) throw new RuntimeException("No more elements!");
        return elements.remove(0);
    }

    public T peek(){
        if(elements==null || elements.isEmpty()) throw new RuntimeException("No more elements!");
        return elements.get(0);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public int count(){
        return elements.size();
    }

    public void show(){
        elements.stream().forEach(System.out::println);
    }

    public static void main(String[] args){
        Queue<String> queue = new Queue();
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        queue.show();
        String s = queue.dequeue();
        System.out.println(s);
        assertEquals("First",s);
    }

    public static void assertEquals(Object expected, Object received){
        if(expected.equals(received)){
            System.out.println("Success!");
        }else{
            System.out.println("Fail!");
        }
    }
}
