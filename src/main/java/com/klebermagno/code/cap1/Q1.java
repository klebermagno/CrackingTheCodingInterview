package com.klebermagno.code.cap1;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Q1 {

    public static void main(String args[]){
        String uniqueString = "aAbcd";
        String nonUniqueString = "aabcd";

        Boolean actual = hasUnicCharsNoAditionalDataStructure(uniqueString); 
        assertEquals(Boolean.valueOf(true), actual);

        actual = hasUnicCharsNoAditionalDataStructure(nonUniqueString);
        assertEquals(Boolean.valueOf(false), actual);

    }

    public static void assertEquals(Object expected, Object actual){
        if(expected.equals(actual)){
            System.out.println("Assert! Actual is equal to expected!");
        } else {
            System.out.printf("Fail! Actual: %s isn't equal to expected: %s\n", actual, expected);
        }
    }

    public static boolean hasUnicCharsNoAditionalDataStructure(String word){
        for(int i = 0; i < word.length()-1; i++){
            for(int j = i+1; j < word.length();j++){
                if (word.charAt(i) == word.charAt(j)){
                    return false;
                }
            }
        }
        return true;
        
    }

    /**
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     * @param word the word to be checked
     */
    public static boolean hasUnicCharsStream(String word){
        Set<Character> characters = new HashSet();
        return word
          .chars()
          .mapToObj(item -> (char)item)
          .noneMatch(character ->{ 
           if(characters.contains(character)){
                return true;
            } else {
                characters.add(character);
                return false;
            }
            
        });


    }
    
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
