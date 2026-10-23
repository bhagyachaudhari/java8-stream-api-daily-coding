package org.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Client8 {
    public static void main(String[] args) {
        // Q: Find Max

        // Input
        List<Integer> input = Arrays.asList(5,3,1,9,4,7,8);
        System.out.println("Input: " + input);

        // Output
        Integer output = input.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("Output: " + output);
    }
}