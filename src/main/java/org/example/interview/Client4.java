package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client4 {
    public static void main(String[] args) {
        // Q: Remove duplicates

        // Prepare an Input
        List<Integer> input = Arrays.asList(5,5,1,1,7,8,9,3,3,0);
        System.out.println("Input: " + input);

        // use distinct operation from stream api
        List<Integer> output = input.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Output: " + output);
    }

}