package by.it_academy.practice.practice11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamplePatternMatcher {
    public static void main(String[] args) {
        String stringPattern = "(a|A){3}";
        String value = "Some aaa string aaaaa AAA";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            System.out.println("start -> " + matcher.start() + " end -> " + matcher.end());
        }

    }
}
