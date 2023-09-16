package com.klebermagno.code.cap1;

import java.util.*;

import com.klebermagno.code.test.Test;

class SubSequence {

    public static void main(String[] args){
        List<Integer> array = Arrays.asList(1,3,4);
        List<Integer> sequence = Arrays.asList(1,2,3, 4);

        Test.assertEquals(true, isValidSubsequence(array, sequence));
    }
  public static boolean isValidSubsequence(
    List<Integer> array, List<Integer> sequence
  ) {
  
    boolean present = true;
    for(int item: sequence){
      boolean subPresent = false;
      for(int sub: array){
        if (item == sub){
          present = true;
          break;
        }
      }
      if(!present)
        return false;
      present = present &&  subPresent; 
    }
    
    
    return present;
  }
}