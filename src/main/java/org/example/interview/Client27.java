package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client27 {

    public static void main(String[] args) {

        // Given a list of Employee objects, group employees by department

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 80000),
                new Employee(2, "Alice", "HR", 60000),
                new Employee(3, "Bob", "IT", 90000),
                new Employee(4, "David", "Finance", 75000),
                new Employee(5, "Emma", "HR", 65000)
        );

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment
                ));

        map.entrySet().forEach(
                e -> {
                    System.out.println(e.getKey() + " : " + e.getValue().toString());
                }
        );
    }
}
