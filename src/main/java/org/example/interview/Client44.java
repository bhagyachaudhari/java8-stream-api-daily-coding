package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client44 {

    public static void main(String[] args) {

        // Find Employees Whose Salary Is Greater Than Average Salary

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 75000),
                new Employee(5, "Emma", "HR", 65000)
        );

        double averageSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));

        List<Employee> output = employees.stream()
                .filter(e -> e.getSalary() > averageSalary)
                .collect(Collectors.toList());

        output.forEach(e->{
            System.out.println(e.getName() + " → " +e.getSalary());
        });
    }
}
