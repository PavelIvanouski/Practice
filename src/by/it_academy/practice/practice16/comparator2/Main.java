package by.it_academy.practice.practice16.comparator2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Student student=new Student(1,"Jane","Java");
        Student student2=new Student(2,"John","React");
        Student student3=new Student(3,"Mike","BA");

        List<Student> students = Arrays.asList(student3, student2,student);


        // печатаем список согласно порядку вставки
        System.out.println(students);

        Collections.sort(students,new StudentDeptComparator());
        // печатаем список, отсортированный по кафедрам студентов
        System.out.println(students);
//
        Collections.sort(students,new StudentNameComparator());
        // печатаем список, отсортированный по именам студентов
        System.out.println(students);
//
        // сортируем список по имени и названию кафедры
        Collections.sort(students,new StudentNameComparator().thenComparing(new StudentDeptComparator()));
        System.out.println(students);

    }

}
