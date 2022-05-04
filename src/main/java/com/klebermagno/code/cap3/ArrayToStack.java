package com.klebermagno.code.cap3;

/**
 * Time Complexities of operations on the stack:
 *
 * push(), pop(), isEmpty() and peek() all take O(1) time.
 */
public class ArrayToStack {

    int elements[];
    int rear=0;
    int front=0;

    public ArrayToStack(int size){
        this.elements = new int[size];
    }

    void push(int element){
        if(elements.length == front){
            throw new RuntimeException("Stack is full!");
        }
        front++;
        elements[front]=element;
    }

    int pop(){
        if(front==0)
            throw new RuntimeException("Stack is empty!");
        int element = elements[front];
        front--;
        return element;
    }

    int peek(){
        if(front==0)
            throw new RuntimeException("Stack is empty!");
        return elements[front];
    }

    boolean isEmpty(){
        if (front==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        ArrayToStack stack = new ArrayToStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.peek());
        assertEquals(3,stack.pop());
        assertEquals(2,stack.peek());
        stack.push(4);
        assertEquals(4,stack.pop());
        assertEquals(2,stack.pop());
        assertEquals(1,stack.pop());
        try {
            stack.pop();
        }catch (RuntimeException e){
            if(e.getMessage().equals("Stack is empty!"))
                System.out.println("Success!");
        }
    }

    public static void assertEquals(Object expected, Object comper){
        if(expected.equals(comper))
            System.out.println("Success!");
        else
            System.out.println("Fail!");
    }
}
