package by.it_academy.practice.practice25.dateTimeExample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate);

        String formatted = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Formatted current DateTime is: " + formatted);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);

        System.out.println(now.getDayOfYear());

    }

}
