package by.it_academy.practice.practice27.shadowingExample;

public class Main {

    private int anInt = 4;

    public Main() {
        anInt = 5;
    }

    public void print(int anInt) {
        System.out.println(anInt);
//        System.out.println(this.anInt);
    }

    public static void main(String[] args) {
        Main main = new Main();
        int anInt = 6;
        main.print(anInt);
    }
}
