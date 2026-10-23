package org.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client45 {

    public static void main(String[] args) {

        // Find the Top 3 Highest-Paid Employees

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 175000),
                new Employee(5, "Emma", "HR", 65000)
        );

        List<Employee> output = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Output : " + output);


    }
}
