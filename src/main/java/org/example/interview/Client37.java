package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client37 {

    public static void main(String[] args) {

        // Handle duplicate keys while using toMap()

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(1, "Bob", "IT", 90000)
        );

        Map<Integer, Employee> output = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Function.identity(),
                        (existing, replacement) -> existing
                ));
        System.out.println("Output: " + output);
    }
}
