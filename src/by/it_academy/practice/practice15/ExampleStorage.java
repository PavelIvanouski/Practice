package by.it_academy.practice.practice15;

import java.util.HashMap;
import java.util.Map;

public class ExampleStorage {
    public static void main(String[] args) {
        Map<Integer, String> lockers = new HashMap<>();

        lockers.put(101, "Bag");
        lockers.put(102, "Jacket");
        lockers.put(103, "Shoes");

        System.out.println(lockers);

        String item = lockers.get(102);
        System.out.println("Retrieved " + item + " from locker 102");

        item = lockers.remove(102);
        System.out.println("Removed " + item + " from locker 102");
        lockers.put(101, "Umbrella");
//
        System.out.println(lockers);
//
//        item = lockers.get(104);
//        if (item != null) {
//            System.out.println("Retrieved " + item + " from locker 104");
//        } else {
//            System.out.println("Locker 104 is empty or does not exist!");
//        }
////
//        item = lockers.remove(104);
//        if (item != null) {
//            System.out.println("Removed " + item + " from locker 104");
//        } else {
//            System.out.println("Locker 104 is empty or does not exist!");
//        }




    }
}
