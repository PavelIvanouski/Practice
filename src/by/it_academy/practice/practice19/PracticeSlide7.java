package by.it_academy.practice.practice19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PracticeSlide7 {
    public static void main(String[] args) {
        /*
        * Дана коллекция Collection<String> col. С помощью stream api:
        узнать, содержит ли какая-нибудь из строк слово login
        найти самую длинную строку
        найти самую короткую строку
        найти строки-слова (не содержат пробелов и знаков препинания)
        получить все слова используемые в строках
        */
        List<String> data = List.of("adf sdsd", "bd sdd sdd", "fg,sa", "login", "da.ta", "papert");

        boolean containsLogin = data.stream().anyMatch(string -> string.contains("login"));
        System.out.println(containsLogin);

        Optional<String> maxString = data.stream().max((str1, str2) -> Integer.compare(str1.length(), str2.length()));
        System.out.println(maxString);
        Optional<String> minString = data.stream().min((str1, str2) -> Integer.compare(str1.length(), str2.length()));
        System.out.println(minString);

        List<String> stringList = data.stream().filter(string -> string.matches("\\w+")).toList();
        System.out.println(stringList);



        List<String> strings = List.of("one two", "one two", "one two three");
        List<String> words = strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")).distinct())
                .distinct()
                .toList();
        System.out.println(words);

        List<String> words2 = strings.stream()
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        System.out.println(words2);

    }
}
