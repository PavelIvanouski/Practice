package by.it_academy.practice.practice18.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Nick", "Bob");

        Comparator<String> comparatorAnonim = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(names, comparatorAnonim);
        System.out.println("Anonymous class sort: " + names);
//
        Comparator<String> comparatorLambda = (name1, name2) -> name1.compareTo(name2);
        Collections.sort(names, comparatorLambda);
        System.out.println("Lambda class sort: " + names);

//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Comparator<Integer> comparatorLambda2 = (num1, num2) -> num1.compareTo(num2);


    }
}
