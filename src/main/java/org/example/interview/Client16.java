package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client16 {
    public static void main(String[] args) {
        // Find any number from the list.

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Input: " + input);

        int output = input.stream()
                .findAny()
                .get();
        System.out.println("Output: " + output);

    }
}
