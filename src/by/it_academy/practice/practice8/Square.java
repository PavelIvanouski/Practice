package by.it_academy.practice.practice8;

public class Square implements Figure{

   private double a;

   public Square(double a) {
       this.a = a;
   }

   @Override
   public double getSquare() {
       return a * a;
   }
}
