package org.example.reduce;

import java.util.Arrays;
import java.util.List;

/**
 * reduce() operation in java stream API
 */
public class Client1 {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Input: " + input);

        System.out.println("/** 1. Find the sum of all numbers in a list **/");
        int sum = input.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        System.out.println("/** 2. Find the product of all numbers **/");
        int product = input.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        System.out.println("/** 3. Find the maximum number **/");
        int max = input.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Max Value: " + max);

        System.out.println("/** 4. Find the minimum number **/");
        int min = input.stream()
                .reduce(Integer.MAX_VALUE,
                        (a, b) -> a < b ? a : b);
        System.out.println("Min Value: " + min);

        System.out.println("/** 5. Find the sum of squares **/");
        int squareSum = input.stream()
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of squares : " + squareSum);

        System.out.println("/** 6. Sum of numbers using identity, " +
                "accumulator and combiner **/");
        int sum2 = input.parallelStream()
                .reduce(0,
                        (a, b) -> a + b,
                        (a, b) -> a + b);
        System.out.println("Sum : " + sum2);

        List<String> input2 = Arrays.asList("Java", "8", "Stream", "API");
        System.out.println("Input: " + input2);

        System.out.println("/** 7. Concatenate all strings **/");
        String concatenatedString = input2.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated String : " + concatenatedString);

        System.out.println("/** 8. Find the total length of all strings **/");
        int totalStrLength = input2.stream()
                .map(String::length)
                .reduce(0, (a, b) -> a + b);
        System.out.println("String Total Length: " + totalStrLength);

        System.out.println("/** 9. Find the longest string **/");
        String longestString = input2.stream()
                .reduce("",
                        (a, b) -> a.length() > b.length() ? a : b);
        System.out.println("Longest String: " + longestString);

        System.out.println("/** 10. Count the total number of characters " +
                "without using count() **/");
        int countChars = input2.stream()
                .map(String::length)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Characters count : " + countChars);


    }
}
