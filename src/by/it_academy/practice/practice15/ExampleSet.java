package by.it_academy.practice.practice15;

import java.util.*;

public class ExampleSet {
    public static void main(String[] args) {
        Integer[] integers1 = {22,45,33,66,55,34,77};
        Integer[] integers2 = {33,2,83,45,3,12,55};

        Set<Integer> integersSet1 = new LinkedHashSet<>();;
//        integersSet1.add(12);
//        integersSet1.add(14);
        integersSet1.addAll(Arrays.asList(integers1));
        System.out.println("integersSet1: " + integersSet1);

        List<Integer> intList = Arrays.asList(integers1);
        System.out.println("intList: " + intList);


//        Set<Integer> integersSet2 = new HashSet<>();
//        integersSet2.addAll(Arrays.asList(integers2));
//        System.out.println("integersSet2: " + integersSet2);
//
////         Finding union
//        Set<Integer> setsUnion = new HashSet<>();
//        setsUnion.addAll(integersSet1);
//        setsUnion.addAll(integersSet2);
//        System.out.println("Union of integersSet1 and integersSet2: " + setsUnion);
//
//        // Finding intersection - пересечение
//        Set<Integer> setsIntersection = new HashSet<>(integersSet1);
//        setsIntersection.retainAll(integersSet2);
//        System.out.println("Intersection of integersSet1 and integersSet2: " + setsIntersection);
////
//        // Finding integersSet1 unique elements - not contained in integersSet2
//        Set<Integer> setsDifference = new HashSet<>(integersSet1);
//        setsDifference.removeAll(integersSet2);
//        System.out.println("Difference of integersSet1 and integersSet2: " + setsDifference);
//
////        Set<Integer> setsDifference1 = new HashSet<>(integersSet2);
////        setsDifference1.removeAll(integersSet1);
////        System.out.println("Difference of integersSet2 and integersSet1: " + setsDifference1);


    }
}
