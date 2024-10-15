package by.it_academy.practice.practice10;


import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.StringTemplate.STR;

public class ExampleString {
    public static void main(String[] args) {


        String Str = new String("Добро пожаловать в It-academy!");
        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.matches("(.*)It-academy(.*)"));
        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.matches("It-academy"));
        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.matches("Добро пожаловать(.*)"));

//        String Str = new String("Добро пожаловать в It-academy!");
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str.replaceAll("(.*)It-academ(.*)",
//                "IAMGROOT"));
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str.replaceAll("It-academy",
//                "Беларусь"));

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






//        final String STR_CONST = "Hello, my name is %s.";


//        // Hello, my name is Pavel
//        String gretting1 = String.format(STR_CONST, name);
//        System.out.println(gretting1);
//        String gretting2 = String.format(STR_CONST, "name");
//        System.out.println(gretting2);







//        greeting = greeting + str;
//
//        System.out.println(greeting.length());
//        System.out.println(greeting.isEmpty());
//
//        String emptyString = "   ";
//        System.out.println(emptyString.isEmpty());
//        System.out.println(emptyString.isBlank());

//        String str1 = "Example string";
//        String str2 = new String("Example string");
//        String str100 = String.valueOf(100);
//        String strBoolean = String.valueOf(false);
//        Byte byteFromStr = Byte.parseByte("1");
//        System.out.println(str100);
//        System.out.println(strBoolean);
//        System.out.println(byteFromStr);



//        String stringWithQuotes = "This is \"BMW\"";
//        System.out.println(stringWithQuotes);
//        String longText = "dsfsdfdggdsgsd dsgsdddddddddddddddddddddddddddddddddddddddddddddddddddddddddd \nagadgsdg";
//        System.out.println(longText);


//        str100 = 'a';


//        String day = "День";
//        String and = "и";
//        String night = "Ночь";
//        String dayAndNight = day + " " + and + " " + night;
//        System.out.println(dayAndNight);

//        String day = "День";
//        String and = "и";
//        String night = "Ночь";
//
//        System.out.println(day.concat(" ").concat(and).concat(" ").concat(night));

        // before java 15
//        String html = "<html>\n" +
//                "    <body>\n" +
//                "        <p>Hello World</p>\n" +
//                "    </body>\n" +
//                "</html>\n";
//        // java 15+
//        String htmlMultiLine = """
//     <html>
//         <body>
//
//
//
//
//
//
//
//             <p>Hello World</p>
//        </body>
//     </html>
//     """;
//        System.out.println(html);
//        System.out.println();
//        System.out.println(htmlMultiLine);



//        String s1 = "Cat";
//        String s2 = "Cat";
//        String s3 = new String("Cat");
//        String s4 = s3.intern();
//
//        System.out.println("s1 == s2 :" + (s1 == s2)); // true
//        System.out.println("s1 == s3 :" + (s1 == s3)); // false
//        System.out.println("s1 == s3 :" + (s1 == s4)); // true

    }

}
