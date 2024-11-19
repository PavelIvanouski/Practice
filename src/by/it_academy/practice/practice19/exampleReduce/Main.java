package by.it_academy.practice.practice19.exampleReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // сумма чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);
        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);
        sum.ifPresent(System.out::println); //output 11

        // сумма начиная с 10
        Integer numbersStartWith10 = numbers.stream()
                .reduce(10, (left, right) -> left + right);
        System.out.println(numbersStartWith10); //output 21
//
        // объединить массив элементов в один результат
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
        System.out.println(result);
//
        // наименьшее число в массиве
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 5, 7);
//        Integer min = numbers1.stream()
//                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);
        Integer min = numbers1.stream()
                .reduce(Math::min).get();
        System.out.println(min); //output 1

        //
        // найти самую длинную строку
        List<String> strings = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ffff");
        String s = strings.stream()
                .reduce("", (left, right) -> left.length() > right.length() ? left : right);
        System.out.println(s); //output ffff
    }
}
