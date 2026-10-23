package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client7 {
    public static void main(String[] args) {
        // Q: Count Elements

        // Prepare an Input
        List<Integer> input = Arrays.asList(4,5,2,1,7,8,9,4,3,2);
        System.out.println("Input: " + input);

        // Use count operation from stream api
        Long count = input.stream()
                .count();
        System.out.println("Output: " + count);
    }

}