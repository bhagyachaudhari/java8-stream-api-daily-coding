package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client9 {
    public static void main(String[] args) {
        // Input
        List<Integer> input = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Input: " + input);

        // output
        List<Integer> output = input.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Output: " + output);
    }
}