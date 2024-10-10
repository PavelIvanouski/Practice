package by.it_academy.practice.practice10;

public class Example11 {
    public static void main(String[] args) {
//        String str1 = "Привет";
//        String str2 = "Привет";
//        if (str1 == str2) {
//            System.out.println("Строки равны");
//        } else {
//            System.out.println("Строки не равны");
//        }


//        String str3 = new String("Привет");
//        if (str1.equals(str3)) {
//            System.out.println("Строки равны");
//        } else {
//            System.out.println("Строки не равны");
//        }

//        String str1 = "Java";
//        String str2 = "JAVA";
//        if(str1.equalsIgnoreCase(str2)){
//            System.out.println("Statement  is true");
//        }else{
//            System.out.println("Statement is false");
//        }


        String str1 = "Java";
        String str2 = "Java";
        String str3 = "ASP";
        int val = 0;
//        val = str1.compareTo(str2);
//        System.out.println(val);
//        val = str1.compareTo(str3);
//        System.out.println(val);
//        val = str3.compareTo(str1);
//        System.out.println(val);

        System.out.println("a".compareTo("b"));
        String str4 = "Java";
        String str5 = "JAVA";
        val = str4.compareToIgnoreCase(str5);
        System.out.println(val);

    }
}
