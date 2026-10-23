package org.example.interview;

import java.util.stream.LongStream;

public class Client50 {

    public static void main(String[] args) {

        // Calculate Sum of 1 to 1 Million Using Parallel Stream

        Long sum = LongStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
        System.out.println("Output: " + sum);
    }
}
