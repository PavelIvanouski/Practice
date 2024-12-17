package by.it_academy.practice.practice26;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PracticeSlide26 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> linkedListClass = Class.forName("java.util.LinkedList");
        Field[] fields = linkedListClass.getDeclaredFields();
        System.out.println("Fields list:");
        for (Field field : fields) {
            System.out.printf("Field: %s%n", field.getName());
        }
        Class<?> parentClass = linkedListClass.getSuperclass();
        System.out.println("Parent class: " + parentClass.getName());
        Method[] methods = linkedListClass.getDeclaredMethods();
        System.out.println("Methods list:");
        for (Method method : methods) {
            System.out.printf("Method: %s%n", method.getName());
        }
        Constructor<?>[] constructors = linkedListClass.getDeclaredConstructors();
        System.out.println("Constructors list:");
        for (Constructor<?> constructor : constructors) {
            System.out.printf("Constructor: %s%n", constructor.getName());
        }
        Class<?>[] declaredClasses = linkedListClass.getDeclaredClasses();
        System.out.println("getDeclaredClasses list:");
        for (Class<?> cls : declaredClasses) {
            System.out.printf("getDeclaredClass: %s%n", cls.getName());
        }
    }
}
