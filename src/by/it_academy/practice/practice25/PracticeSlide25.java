package by.it_academy.practice.practice25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PracticeSlide25 {
    public static void main(String[] args) {
        LocalDate womanDay = LocalDate.of(2024, 3, 8);
        LocalDate mansDay = LocalDate.of(2024, 2, 23);
        LocalDate newYear = LocalDate.of(2024, 1, 1);
        LocalDate dayOctobers = LocalDate.of(2024, 11, 7);
        List<LocalDate> hollyDays = List.of(womanDay, mansDay, newYear, dayOctobers);
        LocalDateTime now = LocalDateTime.now();
        hollyDays.forEach(localDate -> System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yy EEEE"))));
    }
}
