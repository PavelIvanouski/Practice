package by.it_academy.practice.practice14;

import java.util.*;

public class ExampleCollectionsMethods {
    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
        Collections.sort(solarSystem);
        System.out.println(solarSystem);

        UUID uuid = UUID.randomUUID();


//        String mercury = new String("Меркурий");
//        String venus = new String("Венера");
//        String earth = new String("Земля");
//        String mars = new String("Марс");
//        String jupiter = new String("Юпитер");
//        String saturn = new String("Сатурн");
//        String uranus = new String("Уран");
//        String neptune = new String("Нептун");
//        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
//                jupiter, saturn, uranus, neptune));
//        Collections.sort(solarSystem);
//        System.out.println(solarSystem);
//        Collections.reverse(solarSystem);
//        System.out.println(solarSystem);

//        ArrayList<Integer> lottery = new ArrayList<>(100);
//        for (int i = 1; i <= 100; i++) {
//
//            lottery.add(i);//добавляем в барабан числа от 1 до 100
//        }
//        Collections.shuffle(lottery);//перемешиваем
//        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(lottery.get(i));
//        }

//        String mercury = new String("Меркурий");
//        String venus = new String("Венера");
//        String earth = new String("Земля");
//        String mars = new String("Марс");
//        String jupiter = new String("Юпитер");
//        String saturn = new String("Сатурн");
//        String uranus = new String("Уран");
//        String neptune = new String("Нептун");
//        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
//                jupiter, saturn, uranus, neptune)));
//        solarSystem.add("Плутон");//попробуем добавить новый элемент

//        String mercury = new String("Меркурий");
//        String venus = new String("Венера");
//        String earth = new String("Земля");
//        String mars = new String("Марс");
//        String jupiter = new String("Юпитер");
//        String saturn = new String("Сатурн");
//        String uranus = new String("Уран");
//        String neptune = new String("Нептун");
//        ArrayList<String> solarSystemPart1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
//        ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));
//        System.out.println(Collections.disjoint(solarSystemPart1, solarSystemPart2));

    }
}
