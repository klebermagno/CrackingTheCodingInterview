package com.klebermagno.code.advanced.stream;

import java.util.*;
import java.util.stream.IntStream;

public class Cardenals {
    public static void main(String[] args) {

        class Naturals {
            final List<Integer> ordinals;
            final List<Integer> cardinals;

            private Naturals(List<Integer> ordinals, List<Integer> cardinals) {
                this.ordinals = ordinals;
                this.cardinals = cardinals;
            }
        }

        var list = List.of(
                new Naturals(List.of(4, 7, 2, 9), List.of(23, 32, 11, 43, 40)),
                new Naturals(List.of(5, 3, 7, 1), List.of(22, 36, 48, 12, 30)),
                new Naturals(List.of(6, 2, 9, 4, 8, 10), List.of(15, 28, 33, 47, 19, 26)),
                new Naturals(List.of(8, 3, 4, 5, 6), List.of(17, 23, 39, 45, 31, 22, 13)),
                new Naturals(Collections.emptyList(), Collections.emptyList()),
                new Naturals(List.of(1, 0, 2, 9, 5, 8, 6), List.of(21, 32, 18, 44, 27)),
                new Naturals(List.of(3, 5, 7, 2, 10), List.of(24, 50, 46, 20, 37, 14, 15)),
                new Naturals(Collections.emptyList(), List.of(13, 19, 35, 40, 16, 29, 38)),
                new Naturals(List.of(9, 2, 8, 3, 7), List.of(12, 18, 26, 34, 40)),
                new Naturals(List.of(0, 3, 4, 6), List.of(30, 33, 29, 39, 45, 41, 27)),
                new Naturals(List.of(2, 5, 1, 4, 7), Collections.emptyList()),
                new Naturals(List.of(6, 8, 7, 5, 9), List.of(20, 16, 42, 38, 35, 48)));

        // For each Naturals object, multiply all the numbers in the cardinals list by
        // the minimum number in the ordinals list.
        // Discard Naturals objects whose cardinals list is empty. If the ordinals list
        // is empty, use 0.
        // After all numbers have been multiplied, remove any duplicates and find the
        // total sum of the remaining numbers.

        var totalSumOfAllCardinalsMultipliedByTheirCorrespondingMinimumOrdinal = list.stream()
                .filter(n -> n.cardinals.isEmpty() == false)
                .filter(n -> n.ordinals.isEmpty() == false)
                .flatMap(natural -> {
                    int min = natural.ordinals.stream().min(Integer::compareTo).orElse(0);
                    return natural.cardinals.stream().map(cardinal -> cardinal * min);
                }).distinct().mapToInt(Integer::intValue).sum();

        System.out.println(totalSumOfAllCardinalsMultipliedByTheirCorrespondingMinimumOrdinal);
    }
}