package by.it_academy.practice.practice10;

public class Example15 {
    public static void main(String[] args) {
        String sentence = "Обожаю язык программирования Java";
        char ch1 = sentence.charAt(0);
        char ch2 = sentence.charAt(5);
        char ch3 = sentence.charAt(9);
        System.out.println("Буква 0 индекса это: " + ch1);
        System.out.println("Буква 5 индекса это: " + ch2);
        System.out.println("Буква 9 индекса это: " + ch3);


        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);
        String myStr = "Hello, World!";
        myStr.getChars(7, 12, myArray, 4);
        System.out.println(myArray);

//        String str = "ABC";
//        char[] result = str.toCharArray();
//        System.out.println("Char array:");
//        for (int i = 0; i < result.length; i++)
//            System.out.println("Element [" + i + "]: " + result[i]);

    }
}
