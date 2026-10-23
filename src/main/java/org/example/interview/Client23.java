package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client23 {

    public static void main(String args[]) {

        // Convert String[] to List<String>

        String[] arr = new String[] {"Java", "Stream", "API"};
        System.out.println("Input: " + arr.toString());

        List<String> output = Arrays.stream(arr)
                .collect(Collectors.toList());
        System.out.println("Output: " + output);

    }
}
