package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client34 {

    public static void main(String[] args) {

        // Count the frequency of each element - List<String> names =
        //        Arrays.asList("Java", "Spring", "Java", "AWS", "Spring", "Java");

        List<String> names = Arrays
                .asList("Java", "Spring", "Java", "AWS", "Spring", "Java");

        Map<String, Long> output = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(output);
    }
}
