package by.it_academy.practice.practice4;

public class Practice3_1 {
    public static void main(String[] args) {
 /*       Вывести на консоль последовательность:
        1 2 4 8 16 32 64 128 256 512*/

        // вариант 1
//        for (int i = 1; i <= 512; i = i *2) {
//            System.out.print(i + " ");
//        }

        // вариант 2
        for (int i = 0; i < 10; i++) {
            System.out.print(getNumberTwoDegree(i) + " ");
        }


    }

    private static int getNumberTwoDegree(int n) {
        if (n > 0) {
            return 2 * getNumberTwoDegree(n - 1);
        } else {
            return 1;
        }
    }


}
