package by.it_academy.practice.practice14;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayListsOperations {
    public static void main(String[] args) {
//        ArrayList<String> items = new ArrayList<>();
//        items.add("element1");
//        items.add("element2");
//        ArrayList<String> itemsCopy = new ArrayList<>(items);
//        System.out.println(itemsCopy);
//        В примере выше получилось два независимых списка.Изменение одного не приводит к изменениям другого.
//        Но так происходит не всегда. Если список состоит из объектов, которые можно менять,
//        тогда изменение объекта в одном списке, повлияет и на другой,
//        так как копирование списков не копирует элементы списка.
//        ArrayList<User> items = new ArrayList<>();
//        items.add(new User("User1"));
//        items.add(new User("User2"));
//        ArrayList<User> itemsCopy = new ArrayList<>(items);
//        System.out.println(itemsCopy);
//        // Изменение имени пользователя в одном списке
//        // Отражается на пользователе в другом,
//        // так как это один и тот же объект
//        items.get(0).setName("Another Name");
//        System.out.println(itemsCopy);

//        List<String> items1 = List.of("Sun", "Mars");
////        items1.add("Earth");// not allowed - ummutable
//        List<String> items2 = List.of("Sun", "Mars");
//        if (items1 == items2) { // false
//            System.out.println("==");
//        }
//        if (items1.equals(items2)) { // true
//            System.out.println("equals");
//        }
//        //вхождение одного списка в другой
//        boolean b1 = items1.containsAll(items2);// true
//        System.out.println(b1);
//        boolean b2 = items2.containsAll(items1);// true
//        System.out.println(b2);

//        ArrayList<String> items1 = new ArrayList<String>();
//        items1.add("Sun");
//        items1.add("Mars");
//        ArrayList<String> items2 = new ArrayList<String>();
//        items2.add("Uranus");
//        items2.add("Saturn");
//        items1.addAll(items2); // добавляем items2 в items1
//        System.out.println(items1); // => [Sun, Mars, Uranus, Saturn]

//        Иногда нужно получить общий список, не меняя исходного.
//        В таком случае можно воспользоваться копированием
//        ArrayList<String> items1 = new ArrayList<String>();
//        items1.add("Sun");
//        items1.add("Mars");
//        ArrayList<String> items2 = new ArrayList<String>();
//        items2.add("Uranus");
//        items2.add("Saturn");
//        ArrayList<String> items3 = new ArrayList<>(items1);
//        // item1 и item2 не меняются
//        items3.addAll(items2); // добавляем items2 в items3
//        System.out.println(items3); // => [Sun, Mars, Uranus, Saturn]

//        Под пересечением понимается поиск общих элементов,
//        то есть тех, которые есть и в первом, и во втором списке.
//        ArrayList<String> items1 = new ArrayList<String>();
//        items1.add("Sun");
//        items1.add("Uranus");
//        items1.add("Mars");
//        ArrayList<String> items2 = new ArrayList<String>();
//        items2.add("Uranus");
//        items2.add("Uranus");
//        items2.add("Saturn");
//        items1.retainAll(items2);
//        System.out.println(items1); // => [Uranus]

    }
}
