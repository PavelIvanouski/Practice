package by.it_academy.practice.practice26.reflectionExample1;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Определение интерфейсов, реализуемых классом
        Class linkedListClass = LinkedList.class;
        Class[] interfaces = linkedListClass.getInterfaces();
        linkedListClass.getInterfaces();

        System.out.println("Implemented by LinkedList interfaces;");
        for (Class cInterface : interfaces) {
            System.out.println(cInterface.getName());
        }

        // Загрузка и динамическое создание экземпляра класса
//        Class hashSetClass1 = HashSet.class;
        Class hashSetClass = Class.forName("java.util.HashSet");
        HashSet createdHashSet = (HashSet) hashSetClass.getDeclaredConstructor().newInstance();

        System.out.println("Created HashSet: " + createdHashSet);

    }
}


