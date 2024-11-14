package by.it_academy.practice.practice18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/*
* сохраняя только те, которые начинаются с определенной буквы, а затем преобразует отфильтрованные строки в верхний регистр. Используйте лямбды.
//Сигнатура метода:
//public List<String> filterAndTransform(List<String> strings, char startLetter);
//Например: дается список строк [“apple”, “banana”, “avocado”, “blueberry”, “cherry”] и начальную букву ‘a’, функция должна вернуть: [“APPLE”, “AVOCADO”].*/

public class PracticeSlide22 {
    public class Main {
        public static void main(String[] args) {
            List<String> fruits = List.of("apple", "banana", "avocado", "blueberry", "cherry");
            List<String> filteredList = filterAndTransform(fruits, 'c');
            System.out.println(filteredList);
        }

        private static List<String> filterAndTransform(List<String> fruits, char startLetter) {
            Predicate<String> startChar = (fruit) -> fruit.startsWith(String.valueOf(startLetter));
            UnaryOperator<String> toUpperCase = (fruit) -> {
                String resultValue = fruit.toUpperCase();
                return resultValue;
            };
//            UnaryOperator<String> toUpperCase = String::toUpperCase;
            List<String> resultList = new ArrayList<>();
            for (String fruit : fruits) {
                if (startChar.test(fruit)) {
                    resultList.add(toUpperCase.apply(fruit));
                }
            }
            return resultList;
        }
    }

}
