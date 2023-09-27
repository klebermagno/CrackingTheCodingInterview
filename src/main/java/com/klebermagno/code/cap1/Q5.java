package com.klebermagno.code.cap1;

import com.klebermagno.code.test.Test;

public class Q5 {
    /**
     * One Away: 
     * There are three types of edits that can be performed on strings: 
     * insert a character, remove a character, or replace a character. 
     * Given two strings, write a function to check if they are one edit (or zero edits) away.
     * 
     * EXAMPLE:
     *  pale, ple -> true 
     *  pales, pale -> true 
     *  pale, bale -> true 
     *  pale, bake -> false
     */

     public static void main(String[ ] args) {
        String s1 = "pale";
        String s2 = "ple";
        Test.assertEquals(true, hasOneEdit(s1,s2));
        s1 = "pale";
        s2 = "bake";
        Test.assertEquals(false, hasOneEdit(s1,s2));
       
     }

     public static boolean hasOneEdit(String s1, String s2){
         int[] i = {2,3,4};
         for (int j : i){
            System.out.println(j);
         }

        return false;
     }
}
