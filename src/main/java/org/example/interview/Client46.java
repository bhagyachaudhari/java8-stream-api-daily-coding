package org.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Client46 {

    public static void main(String[] args) {

        // Find the Nth Highest Salary

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 175000),
                new Employee(5, "Emma", "HR", 65000)
        );

        int N = 3;
        Double nthHighestSalary = employees.stream()
                .distinct()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .skip(N-1)
                .findFirst()
                .orElse(null);
        System.out.println("Output: " + nthHighestSalary);

    }
}
