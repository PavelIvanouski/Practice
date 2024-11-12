package by.it_academy.practice.practice17;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ExampleInputFromArray {
    public static void main(String[] args) throws IOException {

        // file
        byte[] byteArray = {1,2,3,7};

        InputStream inputStream = new ByteArrayInputStream(byteArray);
        byte[] bytesFromStream = inputStream.readAllBytes();
        System.out.println("Bytes from stream: " + Arrays.toString(bytesFromStream));

        inputStream.close();
        byte[] arr = inputStream.readAllBytes();
        System.out.println(Arrays.toString(arr));
//

    }
}
