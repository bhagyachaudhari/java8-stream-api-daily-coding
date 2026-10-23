package org.example.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Client41 {
    public static void main(String[] args) {
        // Find the First Repeated Character in a String
        String input = "swiss";

        Map<Character, Long> charFrequency =
                input.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

        Character firstRepeatedCharacter =
                charFrequency.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);

        System.out.println("Output: " + firstRepeatedCharacter);
    }
}
