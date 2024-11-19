package by.it_academy.practice.practice18.streamAPI;

import java.util.List;
import java.util.Optional;

public class ExampleMethods4 {
    public static void main(String[] args) {
        List<String> students = List.of(
                "James",
                "Alice",
                "Robert",
                "Bob",
                "Charlie",
                "John",
                "William",
                "Richard"
        );

        // anyMatch
        boolean anyStartsWithR = students.stream()
                .anyMatch(s -> s.startsWith("R"));
        System.out.println(anyStartsWithR);

        // allMatch
        boolean allStartsWithR = students.stream()
                .allMatch(s -> s.startsWith("R"));
        System.out.println(allStartsWithR);

        // noneMatch
        boolean noneStartsWithR = students.stream()
                .noneMatch(s -> s.startsWith("123"));
        System.out.println(noneStartsWithR);

        // findFirst
        Optional<String> first = students.stream()
                .filter(name -> name.startsWith("R"))
                .findFirst();
        String firstString = students.stream()
                .filter(name -> name.startsWith("123"))
                .findFirst().orElse("default value");
        System.out.println(first.orElse("default value"));
//        first.ifPresent(System.out::println);

        // findAny
        Optional<String> any = students.stream()
                .filter(name -> name.startsWith("R"))
                .findAny();
        System.out.println(any);


    }
}
