package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client11 {
    public static void main(String[] args) {

        // Find Sum

        // Input
        List<Integer> input = Arrays.asList(10,20,30,40,50);
        System.out.println("Input: " + input);

        // Output
        int output = input.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Output: " + output);

    }
}