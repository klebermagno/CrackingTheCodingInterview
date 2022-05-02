package com.klebermagno.code.cap1;

public class Q3 {

    /**
     * URLify: Write a method to replace all spaces in a string
     * with '%20'. You may assume that the string has sufficient
     * space at the end to hold the additional characters,
     * and that you are given the "true" length of the string.
     * (Note: If implementing in Java, please use a character
     * array so that you can perform this operation in place.)
     * EXAMPLE Input:
     * "Mr John Smith ", 13
     * Output: "Mr%20John%20Smith"
     *
     * @param s
     * @return
     */
    public static String URLify(String s){

        int size = 0;
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)==' ')
                size++;
        }
        size = s.length() + size * 3-size;
        char[] url = new char[size];
        int j=0;
        for (int i = 0; i<s.length();i++){

            if(s.charAt(i) == ' '){
                url[j++]='%';
                url[j++]='2';
                url[j++]='0';
            }else {
                url[j] = s.charAt(i);
                j++;
            }
        }
        return String.valueOf(url);
    }
}
