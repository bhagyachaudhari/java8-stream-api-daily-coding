package org.example.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class Client1 {
    public static void main(String[] args) {

        // Sample Data
        List<FullTimeEmployee> employees = Arrays.asList(
                new FullTimeEmployee("Amit", "IT", 75000, 25),
                new FullTimeEmployee("Priya", "HR", 55000, 26),
                new FullTimeEmployee("Rahul", "IT", 90000, 27),
                new FullTimeEmployee("Sneha", "HR", 65000, 28),
                new FullTimeEmployee("Neha", "Finance", 80000, 29),
                new FullTimeEmployee("Vikas", "IT", 60000, 30)
        );

        // 1. Collectors.groupingBy() - Group employees by department
        System.out.println("1. Collectors.groupingBy() " +
                "- Group employees by department");

        Map<String, List<FullTimeEmployee>> map =  employees.stream()
                .collect(Collectors.groupingBy(
                   FullTimeEmployee::getDepartment
                ));
        System.out.println("Output: " + map);

        // 2. Collectors.partitioningBy()
        // - How do you divide employees into two groups based on whether
        // their salary is greater than ₹60,000?

        System.out.println("2. Collectors.partitioningBy() " +
                "- How do you divide employees into two groups based on " +
                "whether their salary is greater than ₹60,000?");

        Map<Boolean, List<FullTimeEmployee>> map1 = employees.stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getSalary() > 60000,
                        Collectors.toList()
                ));
        System.out.println("Output: " + map1);

        // 3. Collectors.averagingInt()
        // - How do you calculate the average employee age using Java 8 Streams?
        System.out.println("3. Collectors.averagingInt() " +
                "- How do you calculate the average employee age " +
                "using Java 8 Streams?");

        Map<String, Double> map2 = employees.stream()
                .collect(Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.averagingInt(
                                FullTimeEmployee::getAge
                        )
                ));
        System.out.println("Output: " + map2);

        // 4. Collectors.averagingDouble() - How do you calculate the average
        // salary of employees in each department?
        System.out.println("4. Collectors.averagingDouble() " +
                "- How do you calculate the average salary of employees " +
                "in each department?");

        Map<String, Double> map3 = employees.stream()
                .collect(Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.averagingDouble(
                              FullTimeEmployee::getSalary
                        )
                ));
        System.out.println("Output: " + map3);

        // 5. Collectors.summingDouble() - How do you calculate
        // the total salary paid in each department?
        System.out.println("5. Collectors.summingDouble() - How do you calculate " +
                "the total salary paid in each department?");

        Map<String, Double> map4 = employees.stream()
                .collect(Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.summingDouble(
                                FullTimeEmployee::getSalary
                        )
                ));
        System.out.println("Output: " + map4);

        // 6.Collectors.joining() - How do you join employee names into
        // a single string for each department?
        System.out.println("6.Collectors.joining() - How do you join " +
                "employee names into a single string for each department?");

        Map<String, String> map5 = employees.stream()
                .collect(Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.mapping(
                                FullTimeEmployee::getName,
                                Collectors.joining(", ")
                        )
                ));
        System.out.println("Output: " + map5);

        // 7. Collectors.counting() - How do you count the
        // number of employees in each department?
        System.out.println("7. Collectors.counting() - How do you count the" +
                "number of employees in each department?");

        Map<String, Long> map6 = employees.stream()
                .collect(Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println("Output: " + map6);

        // 8. Collectors.mapping() - How do you group employees
        // by department but collect only their salaries instead
        // of the complete employee objects?

        System.out.println("8. Collectors.mapping() - How do you group employees" +
                "by department but collect only their salaries instead" +
                "of the complete employee objects?");

        Map<String, List<Double>> map7 = employees.stream()
                .collect(Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.mapping(
                                FullTimeEmployee::getSalary,
                                Collectors.toList()
                        )
                ));
        System.out.println("Output: " + map7);

        // 9. Collectors.reducing() - How do you calculate
        // the total salary for each department using reducing()?
        System.out.println("9. Collectors.reducing() - How do you calculate " +
                "the total salary for each department using reducing()?");

        Map<String, Double> map8 = employees.stream()
                .collect(Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.reducing(
                                0.0,
                                FullTimeEmployee::getSalary,
                                Double::sum
                        )
                ));
        System.out.println("Output: " + map8);

        // 10. Collectors.toList() - How do you collect employees
        // earning more than ₹60,000 into a list?
        System.out.println("10. Collectors.toList() - How do you collect employees " +
                "earning more than ₹60,000 into a list?");

        List<FullTimeEmployee> output = employees.stream()
                .filter(e->e.getSalary() > 60000)
                .collect(Collectors.toList());

        System.out.println("Output: " + output);

        // 11. Collectors.toMap() - How do you convert a list of employees
        // into a map where the employee's name is the key and age is the value?
        System.out.println("11. Collectors.toMap() - How do you convert " +
                "a list of employees\n" +
                "into a map where the employee's name is the " +
                "key and age is the value?");

        Map<String, Integer> map9 = employees.stream()
                .collect(Collectors.toMap(
                        FullTimeEmployee::getName,
                        FullTimeEmployee::getAge
                ));
        System.out.println("Output: " + map9);

        // 12. Collectors.maxBy() - How do you find the oldest employee
        // in a list using Collectors.maxBy()?
        System.out.println("12. Collectors.maxBy() - How do you find " +
                "the oldest employee " +
                "in a list using Collectors.maxBy()?");

        Optional<FullTimeEmployee> employee = employees.stream()
                .collect(Collectors.maxBy(
                        Comparator.comparingInt(FullTimeEmployee::getAge)
                ));
        System.out.println("Output: ");
        employee.ifPresent(System.out::println);

    }
}
