package by.it_academy.practice.practice16.slide11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 300.00, 23);
        Employee emp2 = new Employee("Jane", 400.00, 25);
        Employee emp5 = new Employee("Jane", 400.00, 21);
        Employee emp3 = new Employee("Mike", 350.00, 21);
        Employee emp4 = new Employee("Bob", 250.00, 20);
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
//        employees.add(emp4);
        System.out.println("Initial employees " + employees);
        employees.sort(new EmployeeSalaryComparatorDesc());
        System.out.println("Employees sorted by salary " + employees);
        employees.sort(new EmployeeAgeComparator());
        System.out.println("Employees sorted by age " + employees);
        employees.sort(new EmployeeNameComparator());
        System.out.println("Employees sorted by name " + employees);
        employees.sort(new EmployeeNameComparator().thenComparing(new EmployeeAgeComparator()));
        System.out.println("Employees sorted by name and age " + employees);
    }
}