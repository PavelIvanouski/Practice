package by.it_academy.practice.practice16.slide11;

import java.util.UUID;

public class Employee {
    private UUID id;
    private String name;
    private double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}