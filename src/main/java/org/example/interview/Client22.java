package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client22 {
    public static void main(String[] args) {
        // Given a list of integers, calculate the sum using a parallel stream.

        List<Integer> input = Arrays.asList(1,2,3,4,5);
        System.out.println("Input: " + input);

        int sum = input.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Output = " + sum);

    }
}
