package by.it_academy.practice.practice11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegexEmail {
    public static void main(String[] args) {
        String emailAddress = "userName@domain.com";
//        String emailAddress = "userName@domain";
        String regexPattern = "^(.+)@(\\S+)\\.(\\S+)$";

        Pattern emailPattern = Pattern.compile(regexPattern);
        Matcher matcher = emailPattern.matcher(emailAddress);

        if (matcher.matches()) {
            System.out.println("Email address " + emailAddress + " is valid");
        }
        else {
            System.out.println("Email address  is  invalid");
        }

    }
}
