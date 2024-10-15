package by.it_academy.practice.practice10;

import java.util.Scanner;

public class Practice19 {
    public static void main(String[] args) {
//        Введите строку. Если она начинается на ‘abc’, то заменить
//        их на ‘www’, иначе добавить в конец строки ‘zzz’.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.nextLine();
        if (str.startsWith("abc")) {
            str = str.replace("abc", "www");
        } else {
//            str = str + "zzz";
//            str += "zzz";
            str = str.concat("zzz");
        }
        System.out.println(str);

    }

}
