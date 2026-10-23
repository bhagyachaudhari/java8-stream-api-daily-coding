package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client48 {

    public static void main(String[] args) {

        // Find Common Elements Between Two Lists

        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);

        List<Integer> commmon = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println("Output: " + commmon);
    }
}
