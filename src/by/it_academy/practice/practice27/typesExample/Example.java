package by.it_academy.practice.practice27.typesExample;

public class Example {
    public static void main(String[] args) {
//        //  простой пример расширения
//        int bigNumber = 10000000;
//        byte littleNumber = 16;
//        bigNumber = littleNumber;
//        System.out.println(bigNumber);
//        // “Маленькая матрешка” (значение byte) легко влезает в “большую матрешку” (переменную int).


        // засунуть большую матрешку (int) внутрь маленькой (short).
        int bigNumber = 10000000;
        short littleNumber = 1000;
//        littleNumber =  bigNumber;
        littleNumber = (short) bigNumber;
        System.out.println(littleNumber);

    }
}
