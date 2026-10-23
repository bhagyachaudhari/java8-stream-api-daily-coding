package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client47 {
    public static void main(String[] args) {

        // Flatten List<List<String>> into List<String>
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Microservices", "Kafka"),
                Arrays.asList("SQL", "Hibernate")
        );

        List<String> output = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Output: " + output);
    }
}
