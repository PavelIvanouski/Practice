package by.it_academy.practice.practice24.solid.ocp.fix;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
   public double calculateArea() {
       return Math.PI * radius * radius;
   }

   @Override
   public double calculatePerimeter() {
       return 2 * Math.PI * radius;
   }
}
