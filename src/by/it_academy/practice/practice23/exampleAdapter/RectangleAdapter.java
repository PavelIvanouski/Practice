package by.it_academy.practice.practice23.exampleAdapter;

public class RectangleAdapter implements Shape {

   private Rectangle rectangle;

   public RectangleAdapter(Rectangle rectangle) {
       this.rectangle = rectangle;
   }

   @Override
   public double getArea() {
       return rectangle.calculateArea();
   }

   @Override
   public void draw() {
       rectangle.drawRectangle();
   }
}
