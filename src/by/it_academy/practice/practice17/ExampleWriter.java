package by.it_academy.practice.practice17;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleWriter {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("resources/to-write.txt")) {
//            fileWriter.write("Hello World");
            fileWriter.append("HELLO");
        } catch (IOException e) {
            System.out.println("Exception with message: " + e.getMessage() + " occurred");
        }

    }
}
