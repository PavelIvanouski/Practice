package by.it_academy.practice.practice18.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExampleMethods3 {
    public static void main(String[] args) {
        List<String> students = List.of(
                "James",
                "Alice",
                "Robert",
                "Bob",
                "Charlie",
                "John",
                "William",
                "Richard"
        );

        // collect
/*        Map<String, String> collect = students.stream()
                .collect(Collectors.toMap(
                        student -> student.substring(0, 2),
                        student -> student
                ));
        System.out.println(collect);*/


        // min
        String min = students.stream()
                .min(String::compareTo)
                .get();
        System.out.println(min);
//        // min for int list?
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer minInteger = integerList.stream().min(Integer::compareTo).get();
        System.out.println(minInteger);


//
//        // max
        String max = students.  stream()
                .max(String::compareTo)
                .get();
//        Optional<String> maxOptional = students.  stream()
//                .max(String::compareTo);
//        maxOptional.ifPresent(System.out::println);
        System.out.println(max);
//
//        // count
        long count = students.stream()
                .filter(student -> student.length() > 4)
                    .count();
        System.out.println(count );




    }
}
