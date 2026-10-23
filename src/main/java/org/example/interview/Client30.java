package org.example.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Client30 {

    public static void main(String[] args) {

        // Find duplicate elements in a list

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates);

    }
}
