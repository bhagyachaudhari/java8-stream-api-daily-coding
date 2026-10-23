package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client2 {
    public static void main(String[] args) {
        // Q: return odd numbers from a List

        // Prepare an Input List
        List<Integer> list = Arrays.asList(5,1,8,9,3,10,0,-3);
        System.out.println("Input: " + list);

        // Use filter operation from stream api to filter out odd numbers from a list
        List<Integer> output = list.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());
        System.out.println("Output: " + output);
    }

}