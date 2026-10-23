package org.example.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Client1 {
    public static void main(String[] args) {

        // 1. IntStream.range(0, objs.size()).boxed()
        System.out.println("1. IntStream.range(0, objs.size()).boxed()");

        List<String> objs = Arrays.asList("java", "stream", "api");
        System.out.println("Input: " + objs);
        List<Integer> indexes = IntStream
                .range(0, objs.size())
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Output: " + indexes);

        // 2. Arrays.stream(arr)
        System.out.println("2. Arrays.stream(arr)");
        String[] arr = {"Java", "Spring Boot", "Microservices"};

        Arrays.stream(arr)
                .forEach(System.out::println);

        // 3. list.stream()
        System.out.println("3. list.stream()");

        List<Integer> list = Arrays.asList(3, 1, 2, 9, 5, 0, 10);
        System.out.println("Input: " + list);

        list.stream()
                .filter(n -> n > 5)
                .forEach(System.out::println);

        // 4. Stream.of()
        System.out.println("4. Stream.of()");

        Stream<String> strInput = Stream.of("Java", "Developer");
        System.out.println("Input: " + strInput);
        strInput.forEach(System.out::println);

        // 5. IntStream.rangeClosed(1, 10)
        System.out.println("5. IntStream.rangeClosed(1, 10)");
        IntStream.rangeClosed(0, 10)
                .forEach(System.out::println);

        // 6. IntStream.of(2, 32, 2)
        System.out.println("6. IntStream.of(2, 32, 2)");
        IntStream.of(1, 2, 3)
                .forEach(System.out::println);

        // 7. Stream.builder()
        System.out.println("7. Stream.builder()");
        Stream<String> strbuilder = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();
        strbuilder.forEach(System.out::println);

        // 8. Create empty stream
        System.out.println("8. Create empty stream");
        long count = Stream.empty()
                .count();
        System.out.println("Output: " + count);

        // 9. Create IntStream from String value
        System.out.println("9. Create IntStream from String value");
        String str = "tic for tac";

        str.chars()
                .forEach(System.out::println);


        // 10. parallelStream()

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.parallelStream()
                .forEach(System.out::println);

        // 11. Using Stream.iterate()

        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        // 12. Using Stream.generate()

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);



    }
}
