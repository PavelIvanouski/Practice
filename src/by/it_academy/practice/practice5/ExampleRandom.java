package by.it_academy.practice.practice5;

import java.util.Random;

public class ExampleRandom {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
////            System.out.println(Math.random());
//            System.out.println(getRandomDiceNumber());
////            System.out.println(x);
//        }
        Random r = new Random();


        for (int i = 0; i < 10; i++) {
          System.out.println(r.nextInt(40) + 20);
        }
//        System.out.println(r.nextFloat());
//        System.out.println(r.nextDouble());
//        System.out.println(r.nextInt());
////         [0;3)
//        System.out.println(r.nextInt(3));
////         [1;6]
//        System.out.println(r.nextInt(6) + 1);
//        System.out.println(r.nextBoolean());
                // необходимо получить вещественное число в интервале [20; 60)
//        for (int i = 1; i <= 10; i++) {
//            System.out.println((int) (Math.random() * 40 + 20));
//        }
//        [a;b)
//        a = 20, b = 60
//        ( Math.random() * (b-a) ) + a
//        Шаг №1: Диапазон [0;1) умножается на 40. Соответственно,
//        Нижняя граница: 0*40 = 0
//        Верхняя граница: 1*40 = 40
//        Получаем диапазон [0;40)
//
//        Шаг №2: К диапазону [0;40) прибавляем 20. Соответственно,
//        Нижняя граница: 0 + 20  = 20
//        Верхняя граница: 40 + 20 = 60
//        Получаем диапазон [20;60)
//
//        Если просто подставить в формулу, то получим:
//        ( Math.random() * (60 - 20) ) + 20  =>  Math.random() * 40 + 20
    }

    public static int getRandomDiceNumber() {
        // [0;6)
//        return (int) (Math.random() * 6);
        // [1;6]
        return (int) (Math.random() * 6) + 1;
    }

//    Random r = new Random();
//       for(
//    int i = 0;
//    i< 10;i++)
//
//    {

//
//


}
