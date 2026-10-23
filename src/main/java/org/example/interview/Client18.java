package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client18 {
    public static void main(String[] args) {
        // Check whether all numbers are positive.

        List<Integer> input = Arrays.asList(6, 8, 9, 0, 2);
        System.out.println("Input: " + input);

        boolean output = input.stream()
                .allMatch(n -> n > 0);
        System.out.println("Output: " + output);
    }
}
