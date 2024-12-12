package by.it_academy.practice.practice26.annotationPlusReflection2;

public class Person {

   @ValidName
   private String name;

   @ValidAge(min = 10, max = 150)
   private int age;

   public Person(String name, int age) {
       this.name = name;
       this.age = age;
   }
}
