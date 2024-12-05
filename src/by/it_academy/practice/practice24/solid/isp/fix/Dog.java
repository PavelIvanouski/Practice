package by.it_academy.practice.practice24.solid.isp.fix;

public class Dog implements Walker, Swimmer {
   @Override
   public void walk() {
       System.out.println("Dog is walking");
   }

   @Override
   public void swim() {
       System.out.println("Dog is swimming");
   }
}
