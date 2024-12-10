package by.it_academy.practice.practice25.zoneExample;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("UTC+3"));
        System.out.println("ZonedDateTime now: " + zonedDateTimeNow);


    }

}
