package by.it_academy.practice.practice18.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleCreateStream {
    public static void main(String[] args) {
        List<String> names = List.of("Ann","Alice", "Bob", "Charlie");

//        List<String> filteredNames = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .toList();
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
//                .sorted()
//                .filter(name -> name.length() > 3)
                .toList();
        System.out.println(filteredNames);
    }
}
