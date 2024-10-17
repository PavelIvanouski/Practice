package by.it_academy.practice.practice12;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        ColorWithTranslation value1 = ColorWithTranslation.valueOfBYTranslation("желтый");
        System.out.println(value1);

        ColorWithTranslation value2 = ColorWithTranslation.valueOfBYColorNumber(4);
        System.out.println(value2);

        ColorWithTranslation orange = ColorWithTranslation.ORANGE;
        String translation = orange.getTranslation();

        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;


    }
}
