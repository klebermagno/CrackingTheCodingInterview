package com.klebermagno.code.test;

public class Test {

    
    public static void assertEquals(int expected, int actual){
        assertEquals(Integer.valueOf(expected),Integer.valueOf(actual));
    }

    public static void assertEquals(boolean expected, boolean actual){
      assertEquals(Boolean.valueOf(expected),Boolean.valueOf(actual));
    }

    public static void assertEquals(Object expected, Object actual){
        if(expected.equals(actual)){
            System.out.println("Assert! Actual is equal to expected!");
        } else {
            System.out.printf("Fail! Actual: '%s' isn't equal to expected: '%s'\n", actual, expected);
        }
    }
}
