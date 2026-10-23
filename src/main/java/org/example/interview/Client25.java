package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client25 {

    public static void main(String[] args) {

        // map() and flatMap()

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        System.out.println("Input: " + numbers);

        List<Stream<Integer>> mapOutput = numbers.stream()
                .map(List::stream)
                .collect(Collectors.toList());
        System.out.println("map() Output: " + mapOutput);


        List<Integer> flatMapOutput = numbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("flatMap() Output: " + flatMapOutput);

    }
}
