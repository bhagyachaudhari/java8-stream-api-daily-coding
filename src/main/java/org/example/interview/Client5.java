package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client5 {
    public static void main(String[] args) {
        // Q: Sort Ascending

        // Prepare an Input
        List<Integer> input = Arrays.asList(5,7,1,4,9,0,3,3,2);
        System.out.println("Input: " + input);

        // Use sorted operation from stream api
        List<Integer> output = input.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Output: " + output);
    }

}