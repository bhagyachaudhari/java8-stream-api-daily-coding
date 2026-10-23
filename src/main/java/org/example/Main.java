package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> output =
                input.stream()
                        .collect(Collectors.partitioningBy(
                                n -> n % 2 == 0,
                                Collectors.toList()
                        ));

        output.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });
    }
}