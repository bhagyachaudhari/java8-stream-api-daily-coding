package org.example.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Client33 {

    public static void main(String[] args) {

        // Find the highest-paid employee in each department

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 75000),
                new Employee(5, "Emma", "HR", 65000)
        );

        Map<String, Optional<Employee>> output = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(
                                Comparator.comparingDouble(Employee::getSalary)
                        )
                ));

        output.forEach((department, employee) -> {
            System.out.println(department + " : " +employee.orElse(null));
        });
        
    }
}
