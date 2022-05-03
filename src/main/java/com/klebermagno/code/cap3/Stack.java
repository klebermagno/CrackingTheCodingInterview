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
    public void pop(T element){
        elements.add(element);
    }

    /**
     * O(n)
     * @return
     */
    public T push(){
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
}
