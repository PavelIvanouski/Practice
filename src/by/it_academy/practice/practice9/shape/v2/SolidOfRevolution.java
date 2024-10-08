package by.it_academy.practice.practice9.shape.v2;

abstract class SolidOfRevolution implements Shape {
   protected double radius;

   public SolidOfRevolution(double radius) {
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }
}
