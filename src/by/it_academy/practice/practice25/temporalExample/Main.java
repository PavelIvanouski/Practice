package by.it_academy.practice.practice25.temporalExample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of the month is : " + lastDayOfMonth);

        LocalDate firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of the month is : " + firstDayOfMonth);

        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
        LocalDate nextDayOfWeek = now.with(TemporalAdjusters.next(dayOfWeek));
        System.out.println("Next " + dayOfWeek + " date is : " + nextDayOfWeek);

    }

}
