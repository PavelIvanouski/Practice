package by.it_academy.practice.practice12.generics;

public class Main {
    public static void main(String[] args) {
//        IntegerBox integerBox = new IntegerBox(10);
//        StringBox stringBox = new StringBox("Hello");
//
//        Box1 intBox = new Box1();
//        intBox.setItem(10);
//        Box1 strBox = new Box1();
//        strBox.setItem("16");

        Box<String> stringBox1 = new Box<>("World");
        System.out.println(stringBox1);
        Box<Integer> integerBox1 = new Box<>(10);
        System.out.println(integerBox1);
        Box<Boolean> booleanBox = new Box<>(true);
        System.out.println(booleanBox);

        Box<StringBox> stringBoxBox = new Box<>(new StringBox("World"));

        // можно
        Box<Integer> integerBox3 = new Box<Integer>(10);
        // нельзя
//        Box<int> box5 = new Box<>();

        Box<Integer> integerBox = new Box<>(123);
        Box<Double> doubleBox = new Box<>(123.456);

        printBoxInfo(integerBox);
        printBoxInfo(doubleBox);
        printBoxInfo(stringBox1);
    }

//    public static <T extends Number> void printBoxInfo(Box<T> box) {
//        System.out.println("Box info: " + box);
//    }

    public static void printBoxInfo(Box<?> box) {
        System.out.println("Box info: " + box);
    }


    }
