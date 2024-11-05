package by.it_academy.practice.practice16;

import java.util.*;

public class ExampleIterator {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
//         Set<String> fruits = new TreeSet<>(); //элементы будут упорядочены!!!
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Peach");
        fruits.add("Apricot");
        fruits.add("Apple");

        System.out.print("All fruits: ");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
