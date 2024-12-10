package by.it_academy.practice.practice25.formatExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        // форматирование
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String formatted1 = now.format(dateTimeFormatter);
        String formatted1 = now.format(DateTimeFormatter.ofPattern("dd-MMMM-yy EEEE"));
        System.out.println("Formatted current DateTime is: " + formatted1);
        String formatted2 = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Formatted current DateTime is: " + formatted2);
//        // парсинг
        String dateToParse = "01-04-2024";
        LocalDate parsedDate = LocalDate.parse(
                dateToParse,
                DateTimeFormatter.ofPattern("dd-MM-yyyy")
        );
        System.out.println("Parsed string: " + dateToParse + " into LocalDate: " + parsedDate);



        LocalDate parsedDate1 = LocalDate.parse(
                "января 1 2000",
                DateTimeFormatter.ofPattern("MMMM d yyyy")
        );

        // Example String representing a date
        String dateString = "2024-01-20";
        // Parse the String to LocalDate using the formatter
        LocalDate localDate = LocalDate.parse(dateString);
        System.out.println("Parsed string: " + dateString + " into LocalDate: " + localDate);
    }

}
