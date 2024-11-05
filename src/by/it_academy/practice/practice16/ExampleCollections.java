package by.it_academy.practice.practice16;

import by.it_academy.practice.practice16.comparator1.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleCollections {
    public static void main(String[] args) {
        // Copy
//        List<String> srclst = new ArrayList<>();
//        List<String> destlst = new ArrayList<>();
        // populate two lists
//        srclst.add("A");
//        srclst.add("B");
//        srclst.add("C");
//        // or
////        Collections.addAll(srclst, "A", "B", "C");
//        destlst.add("D");
//        destlst.add("E");
//        destlst.add("F");
//        destlst.add("G");
//        // copy into dest list
//        Collections.copy(destlst, srclst);
//        System.out.println("Value of source list: " + srclst);
//        System.out.println("Value of destination list: " + destlst);
//
//        // Empty list
//        List<String> emptyList = Collections.emptyList();
//        System.out.println("Value of empty list: " + emptyList);

//        // Fill
//        List<String> srclst = new ArrayList<>();
//        Collections.addAll(srclst, "apple", "banana", "cherry", "banana", "mango", "orange");
//        List<String> fillList = new ArrayList<>(srclst);
////        List<String> fillList = new ArrayList<>(10);
////        List<String> fillList = new ArrayList<>();
//        System.out.println("fillList berfore fill" + fillList);
//        Collections.fill(fillList, "kiwi");
//        System.out.println("fillList after fill" + fillList);

//        // Frequency
//        List<String> srclst = new ArrayList<>();
//        Collections.addAll(srclst, "apple", "banana", "cherry", "banana", "mango", "orange");
//        int freq = Collections.frequency(srclst, "banana");
//        System.out.println("Frequency of banana: " + freq);

//        // Replace All
//        List<String> srclst = new ArrayList<>();
//        Collections.addAll(srclst, "apple", "banana", "cherry", "banana", "mango", "orange");
//        List<String> replaceList = new ArrayList<>(srclst);
//        Collections.replaceAll(replaceList, "banana", "kiwi");
//        System.out.println("List after ReplaceAll: " + replaceList);

//        // Reverse
//        List<String> srclst = new ArrayList<>();
//        Collections.addAll(srclst, "apple", "banana", "cherry", "banana", "mango", "orange");
//        List<String> reverseList = new ArrayList<>(srclst);
//        Collections.reverse(reverseList);
//        System.out.println("Reversed list: " + reverseList);

//        // Shuffle
//        List<String> srclst = new ArrayList<>();
//        Collections.addAll(srclst, "apple", "banana", "cherry", "banana", "mango", "orange");
//        List<String> shuffleList = new ArrayList<>(srclst);
//        Collections.shuffle(shuffleList);
//        System.out.println("Shuffled list: " + shuffleList);

//        // Swap
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list, "apple", "banana", "cherry", "banana", "mango", "orange");
//        System.out.println("List before swap " + list);
//        Collections.swap(list, 0, 1);
//        System.out.println("List after swap " + list);

//        // Unmodifiable list
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "apple", "banana", "cherry", "banana", "mango", "orange");
        List<String> unmodofiableList = Collections.unmodifiableList(list);
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
              return o1.compareTo(o2);
            }
        };
//        Collections.sort(unmodofiableList, stringComparator);
        System.out.println(unmodofiableList);
        unmodofiableList.add("some fruit");


    }
}
