package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client1 {
    public static void main(String[] args) {
        // Q: Return all even numbers from a List

        // Prepare an Input
        List<Integer> list = Arrays.asList(5,8,2,1,3,5,0,-1,10);
        System.out.println("Input: " + list);

        // Filter even numbers using filter operation from stream api
        List<Integer> output = list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println("Output: " + output);

        int[] arr = {10, 15, 8, 49, 25, 98, 32};
        Map<Boolean, List<Integer>> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Even numbers: " + result.get(true));
    }

}