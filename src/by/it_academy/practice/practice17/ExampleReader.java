package by.it_academy.practice.practice17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleReader {
    public static void main(String[] args) throws IOException {
        // D:\IdeaPr\it-academy\Practice\resources\sample.txt

        //        FileReader fileReader = new FileReader("D:\\IdeaPr\\it-academy\\Practice\\resources\\sample.txt");

// use try with resources
//        try {
//            int nextCharIntValue;
//            while ((nextCharIntValue = fileReader.read()) != -1) {
//                char nextChar = (char) nextCharIntValue;
//                System.out.print(nextChar);
//            }
//        } catch (IOException e) {
//            System.out.println("Exception with message " + e.getMessage() + " occured");
//        } finally {
//            fileReader.close();
//        }

        try (FileReader fileReader = new FileReader("resources/sample.txt");) {
            int nextCharIntValue;
            while ((nextCharIntValue = fileReader.read()) != -1) {
                char nextChar = (char) nextCharIntValue;
                System.out.print(nextChar);
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occured");
        }

    }
}
