package by.it_academy.practice.practice11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeSlide28 {
    public static void main(String[] args) {
        String str = "A bat, a cat, and a rat walked into a bar…";
        String strPatter = "[bcr]at";
        Pattern pattern = Pattern.compile(strPatter);
        Matcher matcher = pattern.matcher(str);
        String startEndTemplate = "%s at %d %n";
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.format(startEndTemplate, "start", matcher.start());
            System.out.format(startEndTemplate, "end", matcher.end());
        }

    }
}
