package org.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Client12 {
    public static void main(String[] args) {
        // Find Min

        // Input
        List<Integer> input = Arrays.asList(5,3,8,9,2,0,1);
        System.out.println("Input: " + input);

        // output
        int output = input.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("Output: " + output);
    }
}