package com.klebermagno.code.cap1;

import com.klebermagno.code.test.Test;

public class Cipher {

    public static void main (String[] args){
        Test.assertEquals(Cipher.caesarCypherEncryptor("xyz", 2),"zab");
    }

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        //z = 122
        //a = 97
    
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();i++){
          int c = str.charAt(i);
    
          key= key%26;
          if ((c+key) > 122){
            c = c - 26;
          }
          c=c+key;
    
    
          sb.append((char)c);
        }
        return sb.toString();
      }
}
