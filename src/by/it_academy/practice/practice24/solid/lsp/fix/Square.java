package by.it_academy.practice.practice24.solid.lsp.fix;

public class Square extends Shape{

    public Square(int side) {
       super(side, side);
   }

   public int getSide() {
       return height;
   }
}
