package by.it_academy.practice.practice11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegexGroup {
    public static void main(String[] args) {
        String str = "      www.it-academy.by    ";

        Pattern pattern = Pattern.compile("www\\.([\\w-]+)\\.by");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            // www.it-academy.by
            System.out.println(matcher.group());
            // it-academy
            System.out.println(matcher.group(1));
        }

    }
}
