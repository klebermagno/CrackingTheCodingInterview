package com.klebermagno.code.cap1;

import com.klebermagno.code.test.Test;

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

    public static void main(String args[]){
        String input = "Mr John Smith    ";
        int trueLength = 13;
        String output = "Mr%20John%20Smith";

        Test.assertEquals(output,URLifyAlgo(input));
        Test.assertEquals(output, URLify(input, trueLength));
    } 

    public static String URLify(String url, int trueLength){

       
        int spaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (url.charAt(i) == ' ')
              spaces++;
        }

        char[] characters = new char[trueLength + (spaces * 2)];
        int charPos = 0;
        for (int j = 0; j < trueLength; j++){
            if (url.charAt(j)== ' '){
                characters[charPos] = '%';
                characters[charPos+1] = '2';
                characters[charPos+2] = '0';
                charPos = charPos + 3;
            } else {
                characters[charPos] = url.charAt(j);
                charPos++;
            }
        }
        return String.valueOf(characters);
    }

    public static String URLifyAlgo(String url){
      
       int count = 0;
       for (int i = url.length()-1; i>=0; i--) {
            if (url.charAt(i) == ' ') {
                count++;
            } else {
                break;
            }
       }
       char[] characters = new char[url.length()];
       int charPos = 0;
       for (int j=0; j< characters.length-count; j++ ) {
            if (url.charAt(j) == ' '){
              characters[charPos] = '%';
              characters[charPos+1] = '2';
              characters[charPos+2] = '0';
              charPos= charPos + 3;
            } else {
                characters[charPos] = url.charAt(j);
                charPos++;
            }
       }
       return String.valueOf(characters);

       } 



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
