package by.it_academy.practice.practice16.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 4);
        Cat murzik = new Cat("Мурзик", 6);
        Cat vaska = new Cat("Васька", 9);

        Stack<Cat> catStack = new Stack<>();
        catStack.push(barsik);
        catStack.push(murzik);
        catStack.push(vaska);

        System.out.println("Текущий стек: " + catStack);

        /*
         * int search(Object o), который ищет заданный элемент в стеке,
         * возвращая количество операций pop(), которые требуются для того
         * чтобы перевести искомый элемент в вершину стека.
         * Если заданный элемент в стеке отсутствует, этот метод возвращает -1.*/
//        System.out.println("Ваське до вершины стека: " + catStack.search(murzik));

        System.out.println("Брысь " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek().toString());
        System.out.println("Брысь " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek().toString());
        System.out.println("Брысь " + catStack.pop());
        System.out.println("Никого? " + catStack.empty());

        /*
         * Если при пустом стеке вызвать методы pop() или peek(),
         * то программа закроется с ошибкой.
         * Чтобы избежать подобной ситуации, нужно обработать исключение EmptyStackException.
         * Тогда программа будет работать без сбоев.*/
        try {
            System.out.println("Кто последний? " + catStack.peek().toString());
        } catch (EmptyStackException e) {
            System.out.println("Пустой стек. Некого прогонять");
        }
        System.out.println("Текущий стек: " + catStack);


    }

}
