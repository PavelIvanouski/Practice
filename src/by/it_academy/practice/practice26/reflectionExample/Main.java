package by.it_academy.practice.practice26.reflectionExample;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        // Получение объекта типа Class
        MyClass myObject = new MyClass();
        Class<? extends MyClass> myClass = myObject.getClass();

        int mods = myClass.getModifiers();

        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }


    }


}
