package by.it_academy.practice.practice19.exampleGroupBy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("Ann", "IT")
        );

//        Predicate<Employee> empLoyeePredicate = employee -> "Alice".equals(employee.getName()) && employee.getDepartment().startsWith("H");
//        List<Employee> filteredByName = employees.stream()
//                .filter(Objects::nonNull)
//                .filter(empLoyeePredicate)
//                .toList();
//        System.out.println(filteredByName);

//        // список сотрудников, сгруппировать их по отделам.
//        Map<String, List<Employee>> employeesByDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(employeesByDepartment);
//        // {HR=[Alice, Charlie], IT=[Bob, David]}
//
//        // Группировка чисел по четности
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
//                .collect(Collectors.groupingBy(num -> num % 2 == 0));
//        System.out.println(groupedByEvenOdd);
//        // {false=[1, 3, 5], true=[2, 4, 6]}
//
//        // Группировка строк по первой букве
//        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry");
//        Map<Character, List<String>> groupedByFirstLetter = words.stream()
//                .collect(Collectors.groupingBy(word -> word.charAt(0)));
//        System.out.println(groupedByFirstLetter);
//        // {a=[apple, apricot], b=[banana, blueberry], c=[cherry]}
    }

}
