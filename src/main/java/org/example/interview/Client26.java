package org.example.interview;

import java.util.stream.IntStream;

public class Client26 {

    public static void main(String[] args) {

        // Print numbers between 100 and 200 whose decimal representation starts with 1.

        IntStream.rangeClosed(100, 200)
                .filter(n -> String.valueOf(n).startsWith("1"))
                .forEach(System.out::println);
    }
}
