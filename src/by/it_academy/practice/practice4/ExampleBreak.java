package by.it_academy.practice.practice4;

public class ExampleBreak {

    public static void main(String[] args) {

//        for(int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("After circle operator");

        for(int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("After circle operator");
    }
}
