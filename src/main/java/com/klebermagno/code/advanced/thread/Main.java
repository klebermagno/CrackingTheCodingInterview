package com.klebermagno.code.advanced.thread;

public class Main extends Thread{ 
    // guarantees visibility, ordering, and atomic access for shared variables
    /*
     * one thread might not immediately see changes to counter made by another thread, 
     * because those changes might not have been flushed from the local memory cache to the
     *  main memory yet. This can lead to issues in multithreaded programs, where timing-related
     *  bugs (known as race conditions) can occur.
     * So, in a nutshell, volatile is ensuring that all threads will see the most recent 
     * changes to counter in your program.
     */
    public static volatile  int counter =0; 

    public void run () { 
        counter++; 
        System.out.println ("Run: " + counter); 
    } 

    public static void main (String[] args) { 

        Main mt = new Main(); 
       // mt.run(); 
       // mt.start();
        counter++; 
        System.out.println ("Main: " + counter); 
    } 
} 