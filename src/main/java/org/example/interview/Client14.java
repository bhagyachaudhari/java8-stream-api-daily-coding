package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client14 {
    public static void main(String[] args) {
        // Given a list of lists, combine all numbers into a single list.
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );

        System.out.println("Input: " + input);

        List<Integer> output = input.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("Output: " + output);
    }
}
