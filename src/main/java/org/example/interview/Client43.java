package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client43 {

    public static void main(String[] args) {

        // Separate Employees Based on Salary

        /* Suppose we want to separate employees into:

        Salary >= 80,000 → High salary
        Salary < 80,000 → Low salary

         */

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 75000),
                new Employee(5, "Emma", "HR", 65000)
        );

        Map<Boolean, List<Employee>> groupedEmployees =
                employees.stream()
                        .collect(Collectors.partitioningBy(
                                employee -> employee.getSalary() >= 80000
                        ));

        System.out.println("High Salary: " +
                groupedEmployees.get(true).stream()
                        .map(Employee::getName)
                        .collect(Collectors.toList()));

        System.out.println("Low Salary: " +
                groupedEmployees.get(false).stream()
                        .map(Employee::getName)
                        .collect(Collectors.toList()));

    }
}
