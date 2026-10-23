package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client52 {

    public static void main(String[] args) {

        // Find common elements between two lists

        List<Integer> listA =
                Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> listB =
                Arrays.asList(3, 4, 5, 6, 7);

        listA.stream()
                .filter(n ->listB.contains(n))
                .distinct()
                .forEach(System.out::println);

    }
}
