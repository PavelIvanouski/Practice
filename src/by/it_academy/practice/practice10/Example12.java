package by.it_academy.practice.practice10;

public class Example12 {
    public static void main(String[] args) {

//        String hello = "Hello";
//        int index1 = hello.indexOf('H');
//        int index2 = hello.indexOf('o');
//        int index3 = hello.indexOf('W');
//        System.out.println("Мы ищем букву 'H' в строке "+hello+". Индекс данной буквы "+index1 );
//        System.out.println("Мы ищем букву 'o' в строке "+hello+". Индекс данной буквы "+index2 );
//        System.out.println("Мы ищем букву 'W' в строке "+hello+". Индекс данной буквы "+index3 );

//        String hello = "Hello";
//        int index1 = hello.indexOf('H', 2);
//        int index2 = hello.indexOf('o', 2);
//        int index3 = hello.indexOf('W', 2);
//        System.out.println("Мы ищем букву 'H' в строке "+hello+" начиная с индекса номер 2. Индекс "+index1 );
//        System.out.println("Мы ищем букву 'o' в строке "+hello+" начиная с индекса 2. Индекс "+index2 );
//        System.out.println("Мы ищем букву 'W' в строке "+hello+" начиная с индекса 2. Индекс "+index3 );

        String gm = "Good morning";
        int index1 = gm.indexOf("morni");
        int index2 = gm.indexOf("Vertex");
        int index3 = gm.indexOf("Good morning", -2);
        int index4 = gm.indexOf("Good morning", 2);
        int index5 = gm.indexOf("Good morning", 999);
        System.out.println("Мы ищем 'morni' в строке "+gm+". Индекс "+index1 );
        System.out.println("Мы ищем 'Vertex' в строке "+gm+". Индекс "+index2 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса -2. Результат: "+index3 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 2. Результат: "+index4 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 888. Результат: "+index5 );

//        String s = "Good news everyone!";
//        int index = s.lastIndexOf("ne");
//        System.out.println(index); //16

//        String s = "Good news everyone!";
//        int index = s.lastIndexOf("ne", 15);
//        System.out.println(index); //5

    }
}
