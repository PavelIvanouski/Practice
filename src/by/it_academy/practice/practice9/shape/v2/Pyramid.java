package by.it_academy.practice.practice9.shape.v2;

class Pyramid implements Shape {
   private double height;
   private double s; // площадь основания 

   public Pyramid(double height, double s) {
      this.height = height;
      this.s = s;
   }

   @Override
   public double getVolume() {
      return s * height / 3;
   }
}
