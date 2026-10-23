package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client15 {
    public static void main(String[] args) {
        // Given a list of numbers, find the first element.

        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Input: " + input);

        int output = input.stream()
                .findFirst()
                .get();
        System.out.println("Output: " + output);
    }
}
