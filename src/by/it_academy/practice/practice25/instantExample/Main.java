package by.it_academy.practice.practice25.instantExample;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Текущая отметка времени
        Instant timestamp = Instant.now();
        System.out.println(timestamp);
        System.out.println(timestamp.toEpochMilli());

//        Instant specificTime = Instant.ofEpochMilli(1709905829000L);
//        System.out.println(specificTime );

        Date date = new Date();
        LocalDateTime dateTime1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(dateTime1);

        Calendar calendar = Calendar.getInstance();
        LocalDateTime dateTime2 = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
        System.out.println(dateTime2);




    }

}
