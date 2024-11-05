package by.it_academy.practice.practice16.slide11;

import java.util.Comparator;

public class EmployeeSalaryComparatorDesc implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
//        int compare = Double.compare(e1.getSalary(), e2.getSalary());
//        if (compare < 0) {
//            compare = 1;
//        } else if (compare > 0) {
//            compare = -1;
//        }
//        return compare ;
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}