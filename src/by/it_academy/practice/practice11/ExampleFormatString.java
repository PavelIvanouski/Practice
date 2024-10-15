package by.it_academy.practice.practice11;

public class ExampleFormatString {
    public static void main(String[] args) {
        String name = "Pavel";
        // Hello, my name is Pavel
        String gretting = String.format("Hello, my name is %s . How are you?  %d , dgsggds %s", name, 123, "Hello");
//        String gretting1 = "Hello, my name is " + name + " . How are you?";
        System.out.println(gretting);
        // Java 22+
        String newGretting = STR."Hello, my name is \{name} sadfaf  \{123}";
        System.out.println(newGretting);
    }
}
