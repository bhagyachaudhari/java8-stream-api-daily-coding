package org.example.mapToObj;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Client1 {
    public static void main(String[] args) {
        // mapToObj() → converts a primitive stream → object stream

        List<String> result = IntStream.rangeClosed(1, 10)
                .mapToObj(n -> "Number - "+n)
                .collect(Collectors.toList());
        System.out.println("Output: " + result);
    }
}
