package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client56 {

    public static void main(String[] args) {
        List<String> technologies =
                Arrays.asList("Java", "Spring", "Kafka");

        String output = technologies.stream()
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }
}
