package by.it_academy.practice.practice9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentComparableMain {
   public static void main(String[] args) {

//       Student student=new Student(1,"John Doe","Java");
//       Student student2=new Student(2,"Jane Doe","Java");
//       Student student3=new Student(3,"Mike","Java");
//
//
//       List<Student> students = Arrays.asList(student, student2,student3);
//       students.forEach(student1 -> System.out.println(student1.toString()));
////       System.out.println(students);
//       System.out.println();
//       Collections.sort(students);
//       students.forEach(student1 -> System.out.println(student1.toString()));
       Student student=new Student(1,"Jane","Java");
       Student student2=new Student(2,"John","React");
       Student student3=new Student(3,"Mike","BA");
       List<Student> students = Arrays.asList(student, student2,student3);

        // печатаем список согласно порядку вставки
       students.forEach(student1 -> System.out.println(student1.toString()));
       System.out.println();
       Collections.sort(students,new StudentDeptComparator());
       // печатаем список, отсортированный по кафедрам студентов
       students.forEach(student1 -> System.out.println(student1.toString()));
       System.out.println();
       Collections.sort(students,new StudentNameComparator());
       // печатаем список, отсортированный по именам студентов
       students.forEach(student1 -> System.out.println(student1.toString()));
       System.out.println();
       // сортируем список по имени и названию кафедры
       Collections.sort(students,new StudentNameComparator().thenComparing(new StudentDeptComparator()));
       students.forEach(student1 -> System.out.println(student1.toString()));

   }
}
