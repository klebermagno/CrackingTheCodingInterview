package com.klebermagno.code.advanced.defaultmethod;

public interface Auto {
    
    /*
    * Java 9 default implementation in inferface
    */
    default void log(){
        System.out.println("Log");
    }
    
}
