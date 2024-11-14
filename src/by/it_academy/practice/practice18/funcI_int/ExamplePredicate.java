package by.it_academy.practice.practice18.funcI_int;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bob");
        names.add("Charlie");

        Predicate<String> filter = name -> name.length() > 3;
        Predicate<String> filter1 = name -> name.startsWith("J");

        List<String> filteredNames =  filterList(names, filter);
        List<String> filteredNames1 =  filterList(names, filter1);

        System.out.println("Filtered names" + filteredNames);
        System.out.println("Filtered names1" + filteredNames1);

    }


    public static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }

}
