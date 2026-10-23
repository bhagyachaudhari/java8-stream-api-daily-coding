package org.example.mapToInt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Client1 {
    public static void main(String[] args) {
        // mapToInt() → converts an object stream → IntStream

        List<String> input = Arrays.asList("Java", "Programming");
        System.out.println("Input: " + input);

        IntStream stream = input.stream()
                .mapToInt(String::length);
        stream.forEach(n -> {
            System.out.print(n + ", ");
        });
    }
}
