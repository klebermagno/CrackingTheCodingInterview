package com.klebermagno.code.cap1;

import java.util.Arrays;

public class Q2 {

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
            System.out.println("s2.charAt(i: "+ s2.charAt(i));
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
