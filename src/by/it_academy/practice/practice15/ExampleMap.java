package by.it_academy.practice.practice15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleMap {
    public static void main(String[] args) {
        Map<String, Integer> symbolToNumber = new HashMap<>();

        symbolToNumber.put("A", 6);
        symbolToNumber.put("A-", 2);
        symbolToNumber.put("B", 9);

        System.out.println("Initial symbolToNumber: " + symbolToNumber);

        symbolToNumber.putIfAbsent("C", 7);
        symbolToNumber.putIfAbsent("A", 11);
        System.out.println("Map after putIfAbsent: " + symbolToNumber);

//        Integer numberByAKey = symbolToNumber.get("A");
//        System.out.println("Number by A key: " + numberByAKey);
//        Integer numberByFKey = symbolToNumber.get("F");
//        System.out.println("Number by F key: " + numberByFKey);
//
//        boolean containsKeyC = symbolToNumber.containsKey("C");
//        System.out.println("Contains key C: " + containsKeyC);
////
//        System.out.println("Contains 6 = " + symbolToNumber.containsValue(6));

        Set<String> keySet = symbolToNumber.keySet();
        System.out.println("keySet: " + keySet);
//
        Collection<Integer> values = symbolToNumber.values();
        System.out.println("values: " + values);
//
        Set<Map.Entry<String,Integer>> entrySet = symbolToNumber.entrySet();
        System.out.println("entrySet: " + entrySet);
    }
}
