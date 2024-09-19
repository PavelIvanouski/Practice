package by.it_academy.practice.practice4;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Загадка: ...");

        boolean needExit = false;
        int currentTry = 0;

        while (currentTry < 3) {
            if (needExit) {
                break;
            }

            System.out.println("Ваш ответ:");
            String answer = sc.next();

            switch (answer) {
                case "Троллейбус":
                    System.out.println("Правильно!");
                    needExit = true;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: троллейбус.");
                    needExit = true;
                    break;
                default:
                    currentTry++;
                    System.out.println("Подумай еще.");
                    break;
            }
        }

        System.out.println("Игра завершена.");

    }
}
