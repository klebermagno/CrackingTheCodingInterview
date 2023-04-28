package com.klebermagno.code.cap1;

import java.util.HashSet;
import java.util.Set;

public class Q1 {

    /**
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     * @param word the word to be checked
     */
    public static boolean hasUnicChars(String word){
        if(word==null || word.length()==0)
            return false;
        if(word.length()>256)
            return false;
        Set<Character> set = new HashSet<>();
        for(int i = 0;i< word.length();i++){
            if(set.contains(word.charAt(i))){
                return false;
            }else {
                set.add(word.charAt(i));
            }

        }

        return true;
    }

    /**
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     * @param word the word to be checked
     */
    public static boolean hasUnicCharsNoDataStructure(String word){

        if(word==null || word.length()>256 || word.isEmpty())
            return false;
        boolean[] charSet = new boolean[256];
        for(int i =0; i<word.length();i++){
            int charInt = word.charAt(i);
            if (charSet[charInt]){
                return false;
            }else{
                charSet[charInt]= true;
            }
        }
        return true;
    }

}
