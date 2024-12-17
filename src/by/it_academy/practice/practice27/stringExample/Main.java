package by.it_academy.practice.practice27.stringExample;

public class Main {
    public static void main(String[] args) {
        Integer i = new Integer("10");
        if (i.toString() == i.toString()) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }
    }

}
