package by.it_academy.practice.practice24.solid.ocp.violation;

public class Shape {

    public double calculateArea(String shapeType, double... dimensions) {
        if (shapeType.equalsIgnoreCase("circle")) {
            double radius = dimensions[0];
            return Math.PI * radius * radius;
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            double width = dimensions[0];
            double height = dimensions[1];
            return width * height;
        } else if (shapeType.equalsIgnoreCase("square")) {
            double width = dimensions[0];
            return width * width;
        } else {
            throw new IllegalArgumentException("Shape type " + shapeType + " not supported");
        }
    }

   public double calculatePerimeter(String shapeType, double...dimensions) {
       if (shapeType.equalsIgnoreCase("circle")) {
           double radius = dimensions[0];
           return 2 * Math.PI * radius;
       } else if (shapeType.equalsIgnoreCase("rectangle")) {
           double width = dimensions[0];
           double height = dimensions[1];
           return 2 * (width + height);
       } else {
           throw new IllegalArgumentException("Shape type " + shapeType + " not supported");
       }
   }
}

