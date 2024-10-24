package by.it_academy.practice.practice14;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollectionMethods {
    public static void main(String[] args) {
//        Collection<String> stringCollection = new ArrayList<>();
//
//        stringCollection.add("1st collection element");
//        stringCollection.add("2st collection element");
//
//        System.out.println("Collection contains " + stringCollection.toString());
//
//        stringCollection.remove("1st collection element");
//        System.out.println("Collection after remove contains " + stringCollection);
//
//        stringCollection.clear();
//        System.out.println("Collection ater clear contains " + stringCollection);
//        System.out.println(stringCollection.isEmpty());

        Collection<Integer> integerCollection = new ArrayList<>();

        integerCollection.add(10);
        integerCollection.add(34);
        integerCollection.add(25);
        integerCollection.add(25);

        Collection<Integer> anotherIntegerCollection = new ArrayList<>();
//        anotherIntegerCollection.add(10);
//        anotherIntegerCollection.add(34);
//        anotherIntegerCollection.add(25);

//        System.out.println("Is integerCollection equal to anotherIntegerCollection: " + integerCollection.equals(anotherIntegerCollection));
//
//        System.out.println("Is integerCollection emplty: " + integerCollection.isEmpty());
//
        System.out.println("integerCollection size: " + integerCollection.size());

    }
}
