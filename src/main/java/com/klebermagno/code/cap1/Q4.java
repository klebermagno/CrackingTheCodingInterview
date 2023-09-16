package com.klebermagno.code.cap1;

import com.klebermagno.code.test.Test;
import java.util.*;

public class Q4 {

    /*
     * Palindrome Permutation: 
     * Given a string, write a function to check if it is a permutation of a palin­ drome. 
     * A palindrome is a word or phrase that is the same forwards and backwards. 
     * A permutation is a rearrangement of letters. 
     * The palindrome does not need to be limited to just dictionary words.
     * 
     *   EXAMPLE
     *   Input: Tact Coa
     *   Output: True (permutations: "taco cat", "atco eta", etc.)
     * 
     *  Hits:
     *   You do not have to-and should not-generate all permutations. This would be very inefficient.
     *   What characteristics would a string that is a permutation of a palindrome have?
     *   Have you tried a hash table? You should be able to get this down to 0(N) time.
     *   Can you reduce the space usage by using a bit vector?
     */
    public static void main(String args[]){
        String input = "Tact Coa";
        Test.assertEquals(true, hasPalindromePermutation(input));
    }
    public static boolean hasPalindromePermutation(String s1){
        s1 = s1.toLowerCase();
        s1 = s1.replaceAll(" ", "");

        Map<Character,Integer> characters = new HashMap();
        for (int i =0 ; i < s1.length(); i++) {
            if (characters.get(s1.charAt(i)) == null) {
                characters.put(s1.charAt(i),1);
            } else {
                Integer sum = characters.get(s1.charAt(i));
                characters.put(s1.charAt(i), sum.intValue() + 1);
            }
        }
        int even = 0;
         for (Map.Entry<Character,Integer> entry : characters.entrySet()) {

            if (entry.getValue()%2 != 0 ){
                even++;
            }
         }

        return even == 0 || (even == 1 && s1.length()%2==0) ;
    }
}
