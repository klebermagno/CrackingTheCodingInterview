package com.klebermagno.code.cap3;

/**
 * First in First out!
 */
public class StackToQueue {

    private int size;
    ArrayToStack stack1;
    ArrayToStack stack2;
    int capacity;

    StackToQueue(int size){
        this.stack1 = new ArrayToStack(size);
        this.stack2 = new ArrayToStack(size);
        capacity = size;
        this.size=0;
    }

    //O(n)
    void enqueue(int element){
        if(capacity==size)
            throw new RuntimeException("Queue is full!");
        while (!stack1.isEmpty()){
            int pop =stack1.pop();
            System.out.println("\n pop: "+pop);
            stack2.push(pop);
        }
        this.stack1.push(element);
        this.size++;
        while (!stack2.isEmpty()){
            int pop =stack2.pop();
            System.out.println("\n pop: "+pop);
            stack1.push(pop);
        }
    }


    boolean isEmpty(){
        return stack2.isEmpty();
    }

    //O(1)
    int dequeue(){
        if(stack1.isEmpty())
            throw new RuntimeException("Queue is empty!");
        size--;
        return stack1.pop();
    }

    public static void main(String[] args){
        StackToQueue queue = new StackToQueue(10);
        queue.enqueue(1);
        System.out.println("enqueue 1");
        queue.enqueue(2);
        System.out.println("enqueue 2");
        queue.enqueue(3);
        System.out.println("enqueue 3") ;
        assertEquals(1,queue.dequeue());
        assertEquals(2,queue.dequeue());
        assertEquals(3,queue.dequeue());

    }
    public static void assertEquals(Object expected, Object comper){
        if(expected.equals(comper))
            System.out.println("Success!");
        else {
            System.out.println("Fail!");
            System.out.println("Expected: " + expected + ", but receive: " +  comper);
        }
    }
}
