package by.it_academy.practice.practice9.shape.v2;

interface Shape extends Comparable<Shape>{

   @Override
   default int compareTo(Shape o) {
      return Double.compare(getVolume(), o.getVolume());
   }

   double getVolume();
}
