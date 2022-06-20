package com.klebermagno.code.advanced.functional;

public class FunnctionalProg {

    public static void main(String[] args) {

        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void printMessage(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.printMessage("Kleber");

        GreetingMessage gm2 = (String name)->{
            System.out.println("Hello " + name);
        };
        GreetingMessage gm3 = (String name)-> System.out.println("Hello " + name);

        gm3.printMessage("Kleber");

        gm2.printMessage("Kleber");

        MessagePrinter mp = ()->{
            System.out.println("Message");
        };
        mp.printMessage();
    }
}
