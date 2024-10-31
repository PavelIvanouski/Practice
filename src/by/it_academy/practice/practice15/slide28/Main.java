package by.it_academy.practice.practice15.slide28;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = getCharsCount("baaccc");
        System.out.println(map);
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            Integer value = map.get(character);
            if (value == null) {
                map.put(character, 1);
            } else {
                map.put(character, value + 1);
            }
        }
        return map;
    }
}
