package by.it_academy.practice.practice7.staticExample;

public class StaticKeywordExample {

    public static int count = 0; // статическая переменная
    public String name;

    public StaticKeywordExample() {
        count++;
    }

    public static void printCount() { // статический метод
        System.out.println("Number of Example objects created so far: " + count);
    }

    public void printNotStatic() {
        System.out.println("not static method");
    }
}
