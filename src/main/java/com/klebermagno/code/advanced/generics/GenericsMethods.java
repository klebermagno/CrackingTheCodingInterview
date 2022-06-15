package com.klebermagno.code.advanced.generics;

import java.util.ArrayList;
import java.util.List;


public class GenericsMethods {

    static final Character[] charArray = { 'a','b','c'};
    static final Integer[] intArray = { 1,2,3};
    static final Boolean[] boolArray = {true, false, true};

    public static<T>  List<T> arrayToList(T[] array, List<T> list){

        list.addAll(List.of(array));
        return list;
    }

    public static void main(String[] args){
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Integer> integerList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());
    }
}
