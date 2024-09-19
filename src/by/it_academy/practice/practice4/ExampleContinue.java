package by.it_academy.practice.practice4;

public class ExampleContinue {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("----");
//        }


        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            System.out.println("----");
        }

    }
}
