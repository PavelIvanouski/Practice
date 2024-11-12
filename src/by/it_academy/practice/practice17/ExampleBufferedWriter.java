package by.it_academy.practice.practice17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleBufferedWriter {
    public static void main(String[] args) {
        try (
             FileWriter fileWriter = new FileWriter("resources/to-write-buffer.txt");
             BufferedWriter bw = new BufferedWriter(fileWriter);
        ) {
            bw.write("line 1");
            bw.newLine();
            bw.write("line 2");
        } catch (IOException e) {
            System.out.println("Exception with message: " + e.getMessage() + " occurred");
        }

    }
}
