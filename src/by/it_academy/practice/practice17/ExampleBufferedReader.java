package by.it_academy.practice.practice17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("resources/to-write-buffer.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception with message: " + e.getMessage() + " occurred");
        }
    }
}
