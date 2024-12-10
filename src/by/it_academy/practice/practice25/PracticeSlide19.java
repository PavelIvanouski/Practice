package by.it_academy.practice.practice25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PracticeSlide19 {
    public static void main(String[] args) {
        String str1 = "Января 16 2000";
        LocalDate localDate1 = parseDateString(str1);
        System.out.printf("Дата %s %s нечетной%n",
                localDate1,
                isDateOdd(localDate1) ? "является" : "не является"
        );
    }

    public static boolean isDateOdd(LocalDate date) {
        return date.getDayOfYear() % 2 == 1;
    }

    public static LocalDate parseDateString(String dateString) {
        return LocalDate.parse(dateString.toLowerCase(), DateTimeFormatter.ofPattern("MMMM d yyyy"));
    }
}
