package by.it_academy.practice.practice24.solid.isp.violation;

public class Dog implements Animal {
   @Override
   public void walk() {
       System.out.println("Dog is walking");
   }

   @Override
   public void swim() {
       System.out.println("Dog is swimming");
   }
}
