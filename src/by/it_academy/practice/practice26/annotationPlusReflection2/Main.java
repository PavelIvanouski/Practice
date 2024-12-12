package by.it_academy.practice.practice26.annotationPlusReflection2;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person  = new Person("John", 30);
        System.out.println("Validation result: " + ObjectValidator.validate(person));

        Person invalidPerson  = new Person("Alice", 200);
        System.out.println("Validation result for invalid person: " + ObjectValidator.validate(invalidPerson));
    }

}
