package by.it_academy.practice.practice10;

public class Example13 {
    public static void main(String[] args) {
        String line = "Good morning";
        boolean b1 = line.endsWith("morning");
        boolean b2 = line.endsWith("evening");
        System.out.println("String " + line + " ends with 'morning'?  " + b1);
        System.out.println("String " + line + " ends with 'evening'?  " + b2);
//
//        String Str = new String("Добро пожаловать в It-academy");
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str.startsWith("Добро пожаловать"));
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str.startsWith("It-academy"));
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str.startsWith("It-academy", 19));

//        String firstString = "Метод regionMatches сравнивает части строк";
//        String secondString = "В Java есть метод regionmatches";
//        System.out.println("Равны ли части строк без учета регистра? - "
//                + firstString.regionMatches(6, secondString, 18, 13));
//        // указываем true первым параметром,
//        // чтобы Java не игнорировала регистр
//        System.out.println("Равны ли части строк с учетом регистра? - "
//                + firstString.regionMatches(true, 6, secondString, 18, 13));

    }
}
