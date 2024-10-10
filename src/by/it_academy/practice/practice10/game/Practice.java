package by.it_academy.practice.practice10.game;

/**
 * Игра - создайте модель персонажа и оружие. Объект Character будет поддерживать методы view, useWeapon.
 * Каждый персонаж сможет использовать оружие.
 * - Персонаж сможет менять оружие на другое.
 * - Способ использования оружия будет зависеть от оружия, которым владеет персонаж, а не от самого персонажа.
 * Решение в виде хорошего дизайна, где легко можно расширить программу дополнительными персонажами и оружием. 
 * Добавьте тестовый код в код метода Main, используйте не менее 3 персонажей и трех видов оружия.
 * Используйте предварительный дизайн.
 */
public class Practice {
    public static void main(String[] args) {
        Knife knife1 = new Knife("нож", 30, "бронза");
        Knife knife2 = new Knife("армейский нож", 50, "бронза");

        Player player = new Player("Парсифаль", knife1);
        Player player2 = new Player("Парсифаль 2", knife1);

        player.view();
        player2.view();

        player.useWeapon(player2);
        player.useWeapon(player2);
        player.useWeapon(player2);
        player.useWeapon(player2);

        player2.view();
        player2.changeWeapon(knife1);
    }
}