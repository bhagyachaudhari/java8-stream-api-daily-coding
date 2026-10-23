package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client42 {

    public static void main(String[] args) {

        // Partition Numbers into Even and Odd

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
        Map<Boolean, List<Integer>> output = numbers.stream()
                .collect(Collectors.partitioningBy(
                        n -> n % 2 == 0
                ));

        System.out.println("Output: " + output);
    }
}
