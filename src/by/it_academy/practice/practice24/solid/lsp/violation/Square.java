package by.it_academy.practice.practice24.solid.lsp.violation;

public class Square extends Rectangle {


   public Square(int side) {
       super(side, side);
   }


   @Override
   public void setWidth(int width) {
       super.setWidth(width);
       super.setHeight(width);
   }

   @Override
   public void setHeight(int height) {
           super.setHeight(height);
           super.setWidth(height);
   }

   public int getSide() {
       return getWidth();
   }
}

