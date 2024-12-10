package by.it_academy.practice.practice25.dateTimeExample;

import java.time.*;

public class MainExample {
    public static void main(String[] args) {

        // Текущая дата
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // Создание с указанием определенных данных
        LocalDate specificDate = LocalDate.of(2024, Month.DECEMBER, 30);
//        LocalDate specificDate1 = LocalDate.of(2024, 12, 30);
        System.out.println(specificDate);
        LocalTime specificTime = LocalTime.of(23, 59, 59, 234782);
        System.out.println(specificTime);
        LocalDateTime specificDateTime = LocalDateTime.of(2024, Month.DECEMBER, 30, 23, 59, 59);
        System.out.println(specificDateTime);

        LocalDate day140_2019 = LocalDate.ofYearDay(2019, 140);
        System.out.println(day140_2019);
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        // Создание с помощью секунд
        LocalDateTime dateTimeEpoch = LocalDateTime.ofEpochSecond(1711574247L, 0, ZoneOffset.UTC);
        System.out.println("dateTimeEpoch " + dateTimeEpoch);




    }


}
