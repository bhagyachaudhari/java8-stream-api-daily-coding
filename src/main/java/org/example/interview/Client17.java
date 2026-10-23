package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client17 {
    public static void main(String[] args) {
        // Given a list of numbers, check whether at least one number is greater than 50

        List<Integer> input = Arrays.asList(10, 30, 60, 40, 50);
        System.out.println("Input: " + input);

        boolean output = input.stream()
                .anyMatch(n -> n > 50);
        System.out.println("Output: " + output);
    }
}
