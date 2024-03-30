package com.klebermagno.code.advanced.collection;

import java.util.*;
import java.util.stream.Collectors;

public class PlayGround {

  public static void main(String[] args) {
    Map<Integer, String> cache = new HashMap<Integer, String>();
    cache.put(1, "Value 1");
    cache.put(2, "Value 2");
    System.out.println(cache.get(1));

    String a = "a";
    String b = "b";
    String c = "c";

    List<String> list = List.of(c, b, a);
    System.out.println(list);

    List<String> Sortedlist = list.stream().sorted().collect(Collectors.toList());
    //this.text = text == null ? Collections.emptyList() : Collections.unmodifiableList(text);


    System.out.println(Sortedlist);

    List<String> list2 = new ArrayList<String>(list);
    list2.sort(Comparator.naturalOrder());
    
    System.out.println(list2);

    list2.sort( new Comparator<String>() {
        public int compare(String a, String b){
            return a.compareTo(b);
        }
    });

    list2.sort((s1, s2) -> s1.compareTo(s2));
    System.out.println(list2);
  }
}
