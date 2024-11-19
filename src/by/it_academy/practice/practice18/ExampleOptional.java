package by.it_academy.practice.practice18;

import java.util.Optional;

public class ExampleOptional {
    public static void main(String[] args) {
        // Creating Optional Objects

//        // To create an empty Optional object
//        Optional<String> empty = Optional.empty();
//        System.out.println(empty.isPresent());

        // We can also create an Optional object with the static method of()
//        String name = "some name";
//        Optional<String> opt = Optional.of(name);
//        System.out.println(opt.isPresent());
       //  NullPointerException
//       String name1 = null;
//       Optional.of(name1);
//
        // in case we expect some null values, we can use the ofNullable() method
        // if we pass in a null reference, it doesn’t throw an exception but rather returns an empty Optional object
//        String name2 = null;
//        Optional<String> opt1 = Optional.ofNullable(name2);
//        System.out.println(opt1.isPresent());
//
        // method returns true if the wrapped value is not null.
//        Optional<String> opt2 = Optional.of("It-academy");
//        System.out.println(opt2.isPresent());
//
        // Also, as of Java 11, we can do the opposite with the isEmpty method
//        Optional<String> opt3 = Optional.of("It-academy");
//        System.out.println(opt3.isEmpty());
//
        // ifPresent()
//        if(name != null) {
//            System.out.println(name.length());
//        }
//        Optional<String> opt4 = Optional.of("It-academy");
//        opt4.ifPresent(value -> System.out.println(value.length()));

        // orElse()
        //The orElse() method is used to retrieve the value wrapped inside an Optional instance.
        // It takes one parameter, which acts as a default value.
        // The orElse() method returns the wrapped value if it’s present, and its argument otherwise
//        String nullName = null;
//        String name1 = Optional.ofNullable(nullName).orElse("john");
//        System.out.println(name1);
////
        // orElseGet()
        //instead of taking a value to return if the Optional value is not present,
        // it takes a supplier functional interface,
        // which is invoked and returns the value of the invocation
//        String nullName1 = null;
//        String name3 = Optional.ofNullable(nullName1).orElseGet(() -> "john");
//        System.out.println(name3);
//
//        // orElseThrow()
        // adds a new approach for handling an absent value
        String nullName2 = null;
        String name4 = Optional.ofNullable(nullName2).orElseThrow(
                IllegalArgumentException::new);


    }
}
