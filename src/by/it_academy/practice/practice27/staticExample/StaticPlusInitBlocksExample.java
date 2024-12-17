package by.it_academy.practice.practice27.staticExample;

public class StaticPlusInitBlocksExample {
   {
       System.out.print("1 ");
   }

   public StaticPlusInitBlocksExample() {
       System.out.print("2 ");
   }

   public static void main(String[] args) {
       System.out.print("3 ");
       StaticPlusInitBlocksExample example = new StaticPlusInitBlocksExample();
       System.out.print("4 ");
   }

   static {
       System.out.print("5 ");
   }

}
