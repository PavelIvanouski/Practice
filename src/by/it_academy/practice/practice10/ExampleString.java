package by.it_academy.practice.practice10;

public class ExampleString {
    public static void main(String[] args) {
//        String greeting = "Hello Students";
//
//        String str = " How are you?";
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



        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();

        System.out.println("s1 == s2 :" + (s1 == s2)); // true
        System.out.println("s1 == s3 :" + (s1 == s3)); // false
        System.out.println("s1 == s3 :" + (s1 == s4)); // true

    }

}
