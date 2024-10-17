package by.it_academy.practice.practice12.flowers;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
//       Flower tulip1 = new Tulip("tulip1", Color.ORANGE, 3);

       Color yellow = Color.YELLOW;
        // YELLOW
       System.out.println(yellow.name());
        // YELLOW
       System.out.println(yellow.toString());
        // 2
       System.out.println(yellow.ordinal());
        // 2
        //[RED, ORANGE, YELLOW, BLUE]
       System.out.println(Arrays.toString(Color.values()));

       Color orange = Color.valueOf("ORANGE");
        //ORANGE
       System.out.println(orange.name());
   }
}