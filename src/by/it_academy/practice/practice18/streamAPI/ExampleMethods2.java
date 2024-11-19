package by.it_academy.practice.practice18.streamAPI;

import java.util.Arrays;
import java.util.List;

public class ExampleMethods2 {
    public static void main(String[] args) {
        List<String> students = List.of(
                "James",
                "Alice",
                "Robert",
                "Robert",
                "Bob",
                "Charlie",
                "John",
                "John",
                "William",
                "Richard"
        );

        // skip
        List<String> studentsSkip3 = students.stream()
                .skip(3)
                .toList();
        System.out.println(studentsSkip3);

        // forEach
        // terminal
        students.stream()
                .forEach(student -> System.out.println(student));

        // toArray
        // terminal
        Object[] sudentsArray = students.stream()
                .toArray();
        System.out.println(Arrays.toString(sudentsArray));

        // reduce
        // terminal
        String studentsReduceOptional = students.stream()
                .reduce((word1, word2) -> word1 + word2).orElse("");
        System.out.println(studentsReduceOptional);


    }
}
