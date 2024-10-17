package by.it_academy.practice.practice11;

public class ExampleRegexString {
    public static void main(String[] args) {
        String str = new String("Добро пожаловать в It-academy!");
        System.out.print("Возвращаемое значение: " );
        System.out.println(str.matches("(.*)It-academy(.*)"));
        System.out.print("Возвращаемое значение: " );
        System.out.println(str.matches("It-academy"));
        System.out.print("Возвращаемое значение: " );
        System.out.println(str.matches("Добро пожаловать(.*)"));

//        String str = new String("Добро пожаловать в It-academy!");
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(str.replaceAll("(.*)It-academ(.*)",
//                "IAMGROOT"));
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(str.replaceAll("It-academy",
////                "Беларусь"));
//
//        String Str1 = new String("Добро пожаловать в It-academy!");
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str1.replaceFirst("(.*)It-academy(.*)",
//                "IAMGROOT" ));
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str1.replaceFirst("It-academy", "IAMGROOT"));
//        String Str2 = new String("Добро пожаловать It-academy! Добро пожаловать It-academy!");
//        System.out.print("Возвращаемое значение: " );
//        System.out.println(Str2.replaceFirst("Добро пожаловать It-academy!", "IAMGROOT!"));

//        String Str = new String("Добро-пожаловать-в-It-academy");
//        System.out.println("Возвращаемое значение: ");
//        for (String retval : Str.split("-", 2)) {
//            System.out.println(retval);
//        }
//        System.out.println();
//        System.out.println("Возвращаемое значение: ");
//        for (String retval : Str.split("-", 3)) {
//            System.out.println(retval);
//        }
//        System.out.println();
//        System.out.println("Возвращаемое значение: ");
//        for (String retval : Str.split("-", 0)) {
//            System.out.println(retval);
//        }
//        System.out.println();
//        System.out.println("Возвращаемое значение: ");
//        for (String retval : Str.split("-")) {
//            System.out.println(retval);
//        }

    }
}
