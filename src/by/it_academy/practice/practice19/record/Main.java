package by.it_academy.practice.practice19.record;

public class Main {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("Bob", 20);
        String name = student.name();
        System.out.println(name);
        System.out.println(student.toString());
        student.sayHello();

        Pair<String, Integer> stringIntegerPair = new Pair<>("Bob", 20);
        System.out.println(stringIntegerPair);
    }
}
