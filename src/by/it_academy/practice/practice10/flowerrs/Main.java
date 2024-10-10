package by.it_academy.practice.practice10.flowerrs;

import java.util.Arrays;
//Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и… что-то на свой вкус).
//Создать несколько объектов-цветов.
//Собрать букет и определить его стоимость (в букет может входить несколько цветов одного типа).
//Определить все цвета, используемые в букете.
//Определить когда весь букет завянет.
public class Main {
    public static void main(String[] args) {
        Flower tulip1 = new Tulip("tulip1", "red", 3);
        Flower tulip2 = new Tulip("tulip2", "yellow", 3);
//        Flower rose = new Flower("rose", "pink", 5, 70);
//        Flower carnation = new Flower("carnation", "white", 7, 30);
//        Flower lily = new Flower("lily", "yellow", 4, 30);
//
        Flower[] flowers = {tulip1, tulip1};
        Bouquet bouquet = new Bouquet(flowers);
//        System.out.println("Full price: " + bouquet.getFullPrice());
//        System.out.println("Flowers colors: " + Arrays.toString(bouquet.getColors()));
//        System.out.println("Bouquet lifetime: " + bouquet.getLifetime());
    }
}