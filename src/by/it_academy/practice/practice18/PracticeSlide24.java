package by.it_academy.practice.practice18;

import java.util.List;
import java.util.stream.Stream;

public class PracticeSlide24 {
    public static void main(String[] args) {

        Employee pers1 = new Employee("Jake", 22);
        Employee pers2 = new Employee("Mike", 32);
        Employee pers3 = new Employee("Alice", 19);
        List<Employee> employeeList = List.of(pers1, pers2, pers3);
//        employeeList.forEach(employee -> System.out.println(employee));
        employeeList.forEach(System.out::println);
    }
}
