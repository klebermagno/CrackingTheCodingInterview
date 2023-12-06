package com.klebermagno.code.advanced.workfall;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * Mike is organizing his shop. He has a few baskets of fruits which he wants to take inventory of
 * before he puts it on the shelf. He wants to count how many of each fruit he has across all the
 * baskets and then order the list alphabetically before he notes it down. Here are the fruit baskets
 * with the amount of fruits in them:
 * orange 14
 * apple 16
 *
 * banana 2
 * banana 6
 *
 * kiwi 3
 * orange 9
 *
 * apple 18
 * banana 4
 * orange 2
 * kiwi 9
 *
 */
public class Workfall {

    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        Item orange = new Item("orange", 14);
        shelf.add(orange);
        Item apple = new Item("apple", 16);
        shelf.add(apple);
        Item banana = new Item("banana",2);
        shelf.add(banana);
        Item banana2 = new Item("banana",6);
        shelf.add(banana2);
        Item kiwi = new Item("kiwi", 3);
        shelf.add(kiwi);
        Item orange2 = new Item("orange",9);
        shelf.add(orange2);
        Item apple2 = new Item("apple", 18);
        shelf.add(apple2);
        Item banana3 = new Item("banana",4);
        shelf.add(banana3);
        Item orange3 = new Item("orange", 2);
        shelf.add(orange3);
        Item kiwi2 = new Item("kiwi",9);
        shelf.add(kiwi2);
        shelf.count();

    }


}
class Shelf {

    private Map<String,Integer>  shelf = new HashMap();
    private final List<Item>  items = new ArrayList<>();
    public void add(Item item){
        Integer itemShelf = shelf.get(item.getName());
        if(itemShelf != null) {
            shelf.put(item.getName(),itemShelf + item.getAmount());
        }else{
            shelf.put(item.getName(),item.getAmount());
        }
    }

    public void count() {
        shelf.forEach((name,amount) -> {
            items.add(new Item(name,amount));
        });
        List<Item> itemsSorted = items.stream().sorted(Comparator.comparing(item -> item.getName())).collect(Collectors.toList());
        itemsSorted.stream().forEach(item -> System.out.println(item.getName()+" "+item.getAmount() ));
    }
}
class Item {
    private int amount;
    private String name;

    public Item( String name, int amount) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
