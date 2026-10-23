package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client20 {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result =
                numbers.stream()
                        .peek(n -> System.out.println(
                                "Original: " + n))
                        .filter(n -> n % 2 == 0)
                        .peek(n -> System.out.println(
                                "After filter: " + n))
                        .map(n -> n * n)
                        .peek(n -> System.out.println(
                                "After map: " + n))
                        .collect(Collectors.toList());

        System.out.println("Final result: " + result);
    }
}
