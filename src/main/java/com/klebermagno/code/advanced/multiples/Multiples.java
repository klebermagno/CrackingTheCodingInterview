package com.klebermagno.code.advanced.multiples;
import java.util.*;

public class Multiples {

  public int solution(int number) {
    
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 1; i <number; i++) {
      if(i%3==0 || i%5==0){
        set.add(i);
      }
    }
    set.stream().forEach(num->System.out.println(num));
    return set.stream().mapToInt(num -> num.intValue()).sum();
  }

  public static void main(String[] args) {
    Multiples multiples = new Multiples();
    System.out.println(multiples.solution(10));
  }
}

