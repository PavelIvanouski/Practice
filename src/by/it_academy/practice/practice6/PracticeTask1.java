package by.it_academy.practice.practice6;

public class PracticeTask1 {
    public static void main(String[] args) {
        //Найти максимальный и минимальный элементы массива и вывести их индекс
        int[] originalArray = {5, -12, 9, -25, 8, 15, -7, 14, 20, -18};

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minValIndex = -1;
        int maxValIndex = -1;

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] < minValue) {
                minValue = originalArray[i];
                minValIndex = i;
            }
            if (originalArray[i] > maxValue) {
                maxValue = originalArray[i];
                maxValIndex = i;
            }
        }

//        if (minValIndex > -1) {
//            System.out.println("Min value index is " + minValIndex);
//        } else {
//            System.out.println("No element found");
//        }
        System.out.println(printIndexMessage(minValIndex, "Min value index is "));

//        if (maxValIndex > -1) {
//            System.out.println("Max value index is " + maxValIndex);
//        } else {
//            System.out.println("No element found");
//        }
        System.out.println(printIndexMessage(maxValIndex, "Max value index is "));
        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        System.out.println(a.length);
    }

    private static String printIndexMessage(int index, String text) {
        if (index > -1) {
            return text + " " + index;
        } else {
            return "No element found";
        }
    }
}
