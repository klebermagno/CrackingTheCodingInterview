package com.klebermagno.code.cap1;

import java.util.*;

import com.klebermagno.code.test.Test;

class SubSequence {

    public static void main(String[] args){
        List<Integer> array = Arrays.asList(1,2,3);
        List<Integer> sequence = Arrays.asList(2,2,3);

        Test.assertEquals(false, isValidSubsequence(array, sequence));
    }
  public static boolean isValidSubsequence(
    List<Integer> array, List<Integer> sequence
  ) {
    if (sequence.size()>array.size())
      return false;
    boolean present = true;
    int pos =0;
    for(int item: sequence){
      boolean subPresent = false;
      for(int sub =pos; sub < array.size(); sub++){
        if (item == array.get(sub)){
          subPresent = true;
          pos=++sub;
          break;
        }
      }
      if(!subPresent)
        return false;
      present = present &&  subPresent; 
    }
    
    
    return present;
  }
}