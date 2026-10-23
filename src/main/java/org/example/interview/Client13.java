package org.example.interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Client13 {
    public static void main(String[] args) throws IOException {
        // How to read file using stream

        try (Stream<String> lines = Files.lines(Paths.get("C:\\testdata\\file.txt"))) {
            lines.forEach(System.out::println);
        }
    }
}