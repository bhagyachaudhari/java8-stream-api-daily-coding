package org.example.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client1 {
    public static void main(String[] args) {
        System.out.println("1. .sorted() — Natural ascending order");
        List<Integer> input = Arrays.asList(50, 40, 30, 20, 10);
        System.out.println("Input: " + input);

        List<Integer> ascSortedList = input.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Output: " + ascSortedList);

        System.out.println("2. .sorted(Comparator.reverseOrder()) " +
                "— Descending order");
        List<Integer> input2 = Arrays.asList(6, 4, 9, 1, 2);
        System.out.println("Input: " + input2);

        List<Integer> descSortedList = input2.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Output: " + descSortedList);

        System.out.println("3. .sorted(Comparator.comparing(obj -> ...)) " +
                "— Sort by a property");

        List<Employee> input3 = Arrays.asList(
                new Employee("Neha", 60000),
                new Employee("Pooja", 90000),
                new Employee("Priya", 50000)
        );

        List<Employee> sortedEmployeesByName = input3.stream()
                .sorted(Comparator.comparing(e -> e.name))
                .collect(Collectors.toList());

        sortedEmployeesByName.stream()
                .forEach(e -> {
                    System.out.println(e.name + " : " + e.salary);
                });

        System.out.println("4. .sorted(Comparator.naturalOrder()) " +
                "— Natural ascending order");
        List<String> input4 = Arrays.asList("Neha", "Pooja", "Priya",
                "John", "Roland");
        System.out.println("Input: " + input4);

        List<String> naturalOrderList = input4.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Names sorted in natural order: "
                + naturalOrderList);

        System.out.println("5. .sorted(Comparator" +
                ".comparing(...).thenComparing(...)) " +
                "— Sort by multiple properties");
        List<Employee> employeeList = Arrays.asList(
                new Employee("Neha", 60000),
                new Employee("Pooja", 90000),
                new Employee("Priya", 50000)
        );

        List<Employee> sortedEmployeeListBySalaryAndName
                = employeeList.stream()
                .sorted(
                        Comparator
                                .comparingInt((Employee e) -> e.salary)
                                .thenComparing(e -> e.name))
                .collect(Collectors.toList());

        sortedEmployeeListBySalaryAndName.stream()
                .forEach(e -> {
                    System.out.println(e.name + " : " + e.salary);
                });

    }
}
