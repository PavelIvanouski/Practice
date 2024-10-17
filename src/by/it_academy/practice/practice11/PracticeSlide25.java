package by.it_academy.practice.practice11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeSlide25 {
    public static void main(String[] args) {
        String str = "It is a long established, fact that a reader will be distracted by the readable, content of a page when looking at its layout.";
        Pattern pattern = Pattern.compile("[,.]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            System.out.println("Matched start: " + matcher.start() + ", end: " + matcher.end());
            count++;
        }
        System.out.println("Total matches: " + count);
    }
}
