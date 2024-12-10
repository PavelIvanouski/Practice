package by.it_academy.practice.practice25.dateTimeExample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class MainExample1 {
    public static void main(String []args) throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate custom = LocalDate.of(2017, 3,2);

        // получение года и проверка на високосность
        System.out.println("Год " + today.getYear() + " високосный? : " + today.isLeapYear());
        // сравнение двух LocalDate: до и после
        System.out.println("Сегодня это до 02.03.2017? : " + today.isBefore(custom));
        // создание LocalDateTime с LocalDate
        LocalDateTime localDateTime = today.atTime(LocalTime.now());
        System.out.println("Текущее время : " + localDateTime);
//
        // операции + и - с датами
        System.out.println("9 дней после сегодняшнего дня будет: " + today.plusDays(9));
        System.out.println("20 месяцев после сегодняшнего дня будет: " + today.plusMonths(20));
        System.out.println("9 дней до сегодняшнего дня будет: " + today.minusDays(9));
        System.out.println("20 месяцев до сегодняшнего дня будет: " + today.minusMonths(20));
//
        System.out.println("Первый день этого месяца: " + today.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Первый день этого года: " + today.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println("Следующая суббота: " + today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));
        System.out.println("2ой вторник в месяце: " + today.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY)));


    }


}
