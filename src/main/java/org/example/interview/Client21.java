package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Client21 {
    public static void main(String[] args) {
        // Given a list of integers, find the average

        List<Integer> input = Arrays.asList(1,6,3,7,2);
        System.out.println("Input: " + input);

        double output = input.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println("Output: " + output);
    }
}
