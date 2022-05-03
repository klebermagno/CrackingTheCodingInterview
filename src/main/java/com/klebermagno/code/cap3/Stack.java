package com.klebermagno.code.cap3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {

    private List<T> elements = new ArrayList<>();

    /**
     * O(1)
     * @param element
     */
    public void push(T element){
        elements.add(element);
    }

    /**
     * O(n)
     * @return
     */
    public T pop(){
        if (elements== null || elements.isEmpty()) throw new EmptyStackException();
        return elements.remove(elements.size()-1);
    }

    /**
     * O(1)
     * @return
     */
    public T peek(){
        if (elements== null || elements.isEmpty()) throw new EmptyStackException();
        return elements.get(elements.size()-1);
    }

    public static void main(String[] args){
        Stack<String> stack = new Stack();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.show();
        String s = stack.pop();
        System.out.println(s);
        assertEquals("Third",s);
        stack.show();
    }

    private void show() {
        elements.stream().forEach(System.out::println);
    }

    public static void assertEquals(Object expected, Object received){
        if(expected.equals(received)){
            System.out.println("Success!");
        }else{
            System.out.println("Fail!");
        }
    }
}
