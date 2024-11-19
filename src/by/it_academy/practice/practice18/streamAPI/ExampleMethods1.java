package by.it_academy.practice.practice18.streamAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMethods1 {
    public static void main(String[] args) {
        List<String> students = List.of(
                "James",
                "Alice",
                "Robert",
                "Robert",
                "Bob",
                "Charlie",
                "John",
                "John",
                "William",
                "Richard"
        );
//        Stream<String> studentsStream = students.stream();
//        studentsStream.forEach(System.out::println);

        // filter
       List<String> studentsStartsWithR = students.stream()
               .filter(student -> student.startsWith("R"))
               .toList();
       System.out.println(studentsStartsWithR);


//        final List<String> list = List.of("one", "two", "three");
//        list.stream()
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.length() <= 3;
//                })
//                .map(s1 -> {
//                    System.out.println("map: " + s1);
//                    return s1.toUpperCase();
//                })
//                .forEach(x -> {
//                    System.out.println("forEach: " + x);
//                });


//       List<String> filterResult = new ArrayList<>();
//       for (String student : students) {
//           if (student.startsWith("R")) {
//               filterResult.add(student);
//           }
//       }
//        System.out.println(filterResult);

       // map
//       List<Character> studentsFirstChar = students.stream()
//               .map(name -> name.toCharArray()[0])
//               .toList();
//       System.out.println(studentsFirstChar);
////        // map to Student class
//       List<Student> studentsList = students.stream()
////               .map(name -> new Student(name))
//               .map(Student::new)
//               .toList();
//       System.out.println(studentsList);
       // peek
//        List<Student> studentsList1 = studentsList.stream()
//                .peek(student -> student.setName("Ivan"))
//                .toList();
//        studentsList1.forEach(System.out::println);


//
//      // distinct
//       List<String> studentsDistinct = students.stream()
//               .distinct()
//               .toList();
//       System.out.println(studentsDistinct );
//       // Set .... Collectors.toSet*/
//        Set<String> studentsDistinctSet = students.stream().collect(Collectors.toSet());
//        Set<String> studentsDistinctSet = new HashSet<>(students);
//        System.out.println(studentsDistinctSet);
//
//        // sorted
//       List<String> studentsSorted = students.stream()
//               .sorted()
//               .toList();
//       System.out.println(studentsSorted);
////       // DESC? sorted((name1, name2) -> name1.compareTo(name2)) */
//        List<String> studentsSortedDesc = students.stream()
//                .sorted((name1, name2) -> name2.compareToIgnoreCase(name1))
//                .toList();
//        System.out.println(studentsSortedDesc);
//
//        // limit
//        List<String> studentsLimit3 = students.stream()
//                .limit(3)
//                .toList();
//        System.out.println(studentsLimit3);

    }
}
