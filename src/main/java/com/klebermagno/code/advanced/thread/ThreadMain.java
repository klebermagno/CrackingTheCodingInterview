package com.klebermagno.code.advanced.thread;


/**
 * Runnable ot Thread, which one to use?
 * Runnable is a interface and let you extend other class in your architecture.
 * Thread is more sophisticated but you can't extendo other class.
 */
public class ThreadMain extends Thread implements Runnable{

    public static void main(String[] args){
        Thread thread = new Thread(() -> {
            for (int i=0;i<=100;i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });
        thread.start();
        Thread thread2 = new Thread(() -> {
            for (int i=0;i<=100;i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });
        thread2.start();
        Thread thread3 = new Thread(new ThreadMain());
        thread3.start();
    }

    @Override
    public void run() {
        for (int i=0;i<=100;i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
