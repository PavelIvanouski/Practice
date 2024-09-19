package by.it_academy.practice.practice4;

public class ExampleNestedCircle {
    public static void main(String[] args) {
//        int weeks = 3;
//        int days = 7;
//        // внешний цикл выводит недели
//        for (int i = 1; i <= weeks; i++) {
//            System.out.println("Week " + i);
//            // внутрений цикл выводит дни
//            for (int j = 1; j <= days; j++) {
//                System.out.println("Day " + j);
//            }
//        }

        int weeks = 3;
        int days = 7;
        // внешний цикл выводит недели
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week " + i);
            // внутрений цикл выводит дни
            for (int j = i; j <= days; j++) {
                System.out.println("Day " + j);
            }
        }

    }
}
