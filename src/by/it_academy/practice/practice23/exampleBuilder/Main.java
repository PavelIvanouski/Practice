package by.it_academy.practice.practice23.exampleBuilder;

public class Main {
    public static void main(String[] args) {

        Pizza pizza =  new Pizza.Builder()
                .size("large")
                .crustType("Thick crust")
                .topping("Pepperoni, Mushrooms, Extra cheese")
                .build();

//        Pizza pizza =  new Pizza.Builder()
//                .crustType("Thick crust")
//                .topping("Pepperoni, Mushrooms, Extra cheese")
//                .build();
//
//        Pizza pizza =  new Pizza.Builder()
//                .crustType("Thick crust")
//                .build();
//
//        Pizza pizza =  new Pizza.Builder()
//                .size("large")
//                .topping("Pepperoni, Mushrooms, Extra cheese")
//                .build();


//        Pizza.Builder builder = new Pizza.Builder();
//        builder = builder.crustType("Thin crust").size("large");
//        builder = builder.size("large");
//        builder = builder.topping("Pepperoni, Mushrooms, Extra cheese");
//        Pizza pizza = builder.build();
//        Pizza pizza2 = new Pizza.Builder()
//                .build();


        System.out.println(pizza);

    }

}
