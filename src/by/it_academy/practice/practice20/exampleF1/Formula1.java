package by.it_academy.practice.practice20.exampleF1;

public class Formula1 {
   public static void main(String[] args) {
       Car car = new Car();

       System.out.println("Start pit stop...");

       long startTime = System.currentTimeMillis();

       car.replaceWheel("front left");
       car.replaceWheel("front right");
       car.replaceWheel("rear left");
       car.replaceWheel("rear right");

       long endTime = System.currentTimeMillis();

       System.out.println("Pit stop completed in " + (endTime - startTime) + " milliseconds");


   }
}


