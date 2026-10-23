package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client19 {
    public static void main(String[] args) {
        // Check whether none of the numbers are negative.

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Input: " + input);

        boolean output = input.stream()
                .noneMatch(n -> n < 0);
        System.out.println("Output: " + output);
    }
}
