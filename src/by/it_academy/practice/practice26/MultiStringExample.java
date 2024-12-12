package by.it_academy.practice.practice26;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MultiStringExample {
    public static void main(String[] args) {

        int a = 5;

        String result = STR."""
                Hello
                \{a}
                One more row
                \{LocalDateTime.now()}
                """;
        System.out.println(result);
    }
}
