package org.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client6 {
    public static void main(String[] args) {
        // Q: Sort Descending

        // Prepare an input
        List<Integer> input = Arrays.asList(5,2,1,3,4,9,0,-1,-4);
        System.out.println("Input: " + input);

        // Use sorted operation with Comparator argument from stream api
        List<Integer> output = input.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Output: " + output);
    }

}