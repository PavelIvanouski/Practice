package by.it_academy.practice.practice8;

public class Rectangle implements Figure {

   private double a;
   private double b;

   public Rectangle(double a, double b) {
       this.a = a;
       this.b = b;
   }

   @Override
   public double getSquare() {
           return a * b;
   }
}
