package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client24 {

    public static void main(String[] args) {

        // List to Array

        List<String> input = Arrays.asList("Java", "Stream", "API");
        System.out.println("Input: " + input);

        String[] output = input.stream()
                .toArray(String[]::new);
        System.out.println("Output: " + Arrays.toString(output));

    }
}
