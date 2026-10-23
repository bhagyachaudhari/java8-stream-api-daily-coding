package org.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Client32 {

    public static void main(String[] args) {

        // Find the highest-paid employee

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 75000),
                new Employee(5, "Emma", "HR", 65000)
        );

        Employee highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        System.out.println("Output: " + highestPaidEmployee);

    }
}
