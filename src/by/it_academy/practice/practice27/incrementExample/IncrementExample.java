package by.it_academy.practice.practice27.incrementExample;

public class IncrementExample {
    public static void main(String[] args) {
//        int i = 5;
//        int result = ++i; // first increment, then assign the value to result
//        System.out.println(i); // output 6
//        System.out.println(result); // output 6

//        int i = 5;
//        int result = i++; // first assign i to result, then increment i
//        System.out.println(i); // output 6
//        System.out.println(result); // output 5

        int i = 5;
        int result1 = ++i + 10; // pre-increment
        int result2 = i++ + 10; // post-increment
        System.out.println("i after operations: " + i); // 7
        System.out.println("result1: " + result1); // 16
        System.out.println("result2: " + result2); // 16


    }
}
