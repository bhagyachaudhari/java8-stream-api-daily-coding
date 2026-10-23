package org.example.interview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client51 {
    public static void main(String[] args) {

        // Count the frequency of each word

        String str = "java spring java kafka spring java";

        Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .forEach((e) -> {
                    System.out.println(e.getKey() + " = " + e.getValue());
                });
    }
}
