package by.it_academy.practice.practice14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {
//          List<String> list = new LinkedList<>();// можно легко подменить реализацию списка
        List<String> list = new ArrayList<>();

        list.add("Moscow");
        list.add("Berlin");
        list.add("Tokyo");

        System.out.println("Cities: " + list);

        list.add(1, "Barcelona");
        list.add(3, "Minsk");
//
        System.out.println("Cities: " + list);

        list.remove(2);
        System.out.println("Cities: " + list);

        System.out.println("First city is " + list.get(0));
        System.out.println("All cities: " + list.size());
    }
}
