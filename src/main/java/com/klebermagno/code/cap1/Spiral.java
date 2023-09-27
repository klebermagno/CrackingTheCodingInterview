package com.klebermagno.code.cap1;

import java.util.ArrayList;
import java.util.List;

import com.klebermagno.code.test.Test;

import java.util.Arrays;

public class Spiral {

    public static void main(String args[]) {
        var input = new int[][] {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7},
          };
          var expected =
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
          var actual = Spiral.spiralTraverse(input);
          Test.assertEquals(expected, actual);

    }

public static List<Integer> spiralTraverse(int[][] array) {
    List<Integer> result = new ArrayList<Integer>();
    if (array.length == 1 && array[0].length == 1 ){
      result.add(Integer.valueOf(array[0][0]));
      return result;
    }
      
    int startRow =0;
    int startColumn = 0; 
    int endRow = array.length-1;
    int endColumn = array[0].length-1;

    
    while (startRow <= endRow && startColumn <= endColumn){
      //L->R
      for(int i =startColumn; i<= endColumn; i++){
        result.add(Integer.valueOf(array[startRow][i]));
      }
      startRow++;
      //U->D
      for(int j = startRow; j<= endRow;j++){
        result.add(Integer.valueOf(array[j][endColumn]));
      }
     endColumn--;
      //R->L
      for(int k = endColumn; k >= startColumn; k--){
        result.add(Integer.valueOf(array[endRow][k]));
      }
      endRow--;
      //D-U
      for(int i = endRow; i>= startRow; i--){
        result.add(Integer.valueOf(array[i][startColumn]));
      }
      startColumn++;
      
      
    }


    
    // Write your code here.
    return result;
  }
}
