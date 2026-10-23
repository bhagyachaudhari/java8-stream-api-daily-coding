package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client3 {
    public static void main(String[] args) {
        // Q: Convert to uppercase

        // Prepare an Input
        List<String> list = Arrays.asList("i", "love", "java");
        System.out.println("Input: " + list);

        // use map operation from stream api
        List<String> output = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Output: " + output);
    }

}