package by.it_academy.practice.practice11;

import java.util.Formatter;

public class ExampleFormatter {
    public static void main(String[] args) {
//        Formatter f = new Formatter();
//        f.format("This %s is about %n%S %c %s", "book", "java", '8', 123);
//        System.out.print(f);

//        double x = 1000.0 / 3.0;
//        System.out.println("Строка без форматирования: " + x);
//        Formatter formatter = new Formatter();
//        formatter.format("Строка c форматированием: %.2f%n", x);
//        formatter.format("Строка c форматированием: %8.2f%n", x);
//        formatter.format("Строка c форматированием: %16.2f%n", x);
//        System.out.println(formatter);

//        System.out.printf("Строка c форматированием: %.2f%n", 1000.0 / 3.0);
//        System.out.format("%s, в следующем году вам будет %d", "Джон", 23);
        //  , -   Числовые значения включают разделители групп. Применим только к числам.
        double v1 = 10000000000.0 / 3.0;
        System.out.printf("%, .2f%n", v1);
        //( - Отрицательные числовые значения заключаются в скобки. Применим только к числам.
        double v2 = -10000.0 / 3.0;
        System.out.println(v2);
        System.out.printf("%, (.2f%n", v2);
        // 0  -  Выводит значение, дополненное нулями вместо пробелов. Применим только к числам.
        System.out.printf("%09.2f%n", 10000.0 / 3.0);

    }
}
