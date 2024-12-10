package by.it_academy.practice.practice25.old;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // текущая дата и время
        Date date = new Date();
        System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());

        // количество миллисекунд
        long time = date.getTime();
        System.out.println("Unix format time: " + time);

        // deprecated
        int minutes = date.getMinutes();
        System.out.println("Minutes: " + minutes);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Time according to calendar: " + calendar.getTime());
        System.out.println("Weeks in year according to calendar: " + calendar.getWeeksInWeekYear());
        someMethod();
    }


    @Deprecated
    /*
    * use someNewMethod
    *
    * */
    public static void someMethod() {

    }

    public static void someNewMethod() {

    }

}
