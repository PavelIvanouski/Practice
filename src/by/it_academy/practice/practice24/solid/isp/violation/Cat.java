package by.it_academy.practice.practice24.solid.isp.violation;

public class Cat implements Animal {
   @Override
   public void walk() {
       System.out.println("Cat is walking");
   }

   @Override
   public void swim() {
       throw new RuntimeException("Cats can't swim");
   }
}
