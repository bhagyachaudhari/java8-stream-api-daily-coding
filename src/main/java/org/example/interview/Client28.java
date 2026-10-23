package org.example.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client28 {

    public static void main(String[] args) {

        // Calculate frequency of each character in a given string -> String s = "tic for tac"

        String str = "tic for tac";

        Map<Character, Long> output = str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                );

        output.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });

    }
}
