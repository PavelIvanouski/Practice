package by.it_academy.practice.practice19.practiceSlide4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 20);
        Employee emp2 = new Employee("Bob", 22);
        Employee emp3 = new Employee("Alice", 25);
        Employee emp4 = new Employee("Alexander", 30);
        Employee emp5 = new Employee("Dmitry", 40);
        Employee emp6 = new Employee("Nikita", 31);
        List<Employee> employees = List.of(emp1, emp2, emp3, emp4, emp5, emp6);

        Double average = employees.stream()
                .filter((emp) -> emp.getAge() > 25)
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);
        System.out.printf("Average is %.2f%n", average);
    }

}
