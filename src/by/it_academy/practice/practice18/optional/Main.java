package by.it_academy.practice.practice18.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Dog bobik = null;

        Optional<Dog> dog = Optional.ofNullable(null);

//        if (dog.isPresent()) {
//            System.out.println(dog.get().getName());
//        }

        dog.ifPresent(System.out::println);

//        Dog bobik1 = (Dog) Optional.ofNullable(null).orElse(new Dog("Bobik2", 6));

    }
}
