package com.klebermagno.code.cap1;

import java.util.Arrays;

import com.klebermagno.code.test.Test;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Q2 {

    /*
    * Check Permutation: Given two strings,write a method to decide if one is a permutation of the
    * other.
    * 
    * Exaple input: 
    * string1 = "listen"
    * string2 = "silent"
    * 
    * Output:
    * true
    */
    public static void main(String args[]){
        String evaluetString_1 = "listen";
        String evaluetString_2 = "silent";

        Test.assertEquals(true, hasPermutation_1(evaluetString_1, evaluetString_2));
        Test.assertEquals(true, hasPermutationSort(evaluetString_1, evaluetString_2));
        Test.assertEquals(true, hasPermutationCountingChars(evaluetString_1, evaluetString_2));
    }

    public static boolean hasPermutationCountingChars(String input1, String input2){
        if (input1 == null || input2 == null ||  input1.equals("") || input2.equals(""))
          return false;
        if (input1.length()!=input2.length())
          return false;

        char[] letters = new char[128];

        for(int i = 0; i < input1.length(); i++){
            char c = input1.charAt(i);
            letters[c]++;
        }
        for(int j = 0; j < input2.length(); j++){
            char c = input2.charAt(j);
            letters[c]--;
            if (letters[c]<0)
              return false;
        }
        return true;
    }
    public static boolean hasPermutationSort(String input1, String input2){
        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();
         Arrays.sort(chars1);
         Arrays.sort(chars2);
         
        return Arrays.equals(chars1,chars2);
    }
   public static boolean hasPermutation_1(String input1, String input2){
    if (input1 == null || input2 == null ||  input1.equals("") || input2.equals(""))
      return false;

    Set<Character> characters1 = input1.codePoints().mapToObj(c ->(char)c).collect(Collectors.toSet());
    Set<Character> characters2 = input2.codePoints().mapToObj(c ->(char)c).collect(Collectors.toSet());

    if(characters1.size()!=characters2.size())
      return false;
    return !characters1.stream().noneMatch(characters2::contains);
    
   }


    public static boolean hasPermutation(String s1, String s2){
        if(s1.length()>s2.length())
            return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i =0; i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
            System.out.println("arr1: "+arr1[i]);
            System.out.println("arr2: "+arr2[i]);
            System.out.println("s2.charAt i: "+ s2.charAt(i));
            System.out.println(s2.charAt(i)-'a');
        }
        return false;

    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr1, arr2)) return true;

        int front = 0;
        int back = s1.length();
        while(back < s2.length()){
            arr2[s2.charAt(front) - 'a']--;
            arr2[s2.charAt(back) - 'a']++;

            if(Arrays.equals(arr1, arr2)) return true;
            front++;
            back++;
        }
        return false;
    }
}
