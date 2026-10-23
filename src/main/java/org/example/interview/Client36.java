package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client36 {

    public static void main(String[] args) {

        // Convert List<Employee> into Map<Id, Employee>

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 75000),
                new Employee(5, "Emma", "HR", 65000)
        );

        Map<Integer, Employee> output = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Function.identity()
                ));
        System.out.println(output);

    }
}
