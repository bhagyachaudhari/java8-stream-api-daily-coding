package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client10 {
    public static void main(String[] args) {

        // Input
        List<Integer> input = Arrays.asList(10,20,30,40,50,60);
        System.out.println("Input: " + input);

        // Output
        List<Integer> output = input.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("Output: " + output);
    }
}