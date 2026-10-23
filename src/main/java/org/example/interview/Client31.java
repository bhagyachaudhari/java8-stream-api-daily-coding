package org.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Client31 {

    public static void main(String[] args) {

        // Find the second-highest number from a list using Stream API.
        List<Integer> numbers =
                Arrays.asList(10, 50, 30, 80, 60, 80, 40);

        Integer result = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Output: " + result);
    }
}
