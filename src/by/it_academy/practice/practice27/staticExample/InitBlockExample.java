package by.it_academy.practice.practice27.staticExample;

public class InitBlockExample {
   int instanceVar;

   {
       instanceVar = 42;
       System.out.println("Instance initializer block executed. instanceVar= " + instanceVar);
   }

   public InitBlockExample() {
       System.out.println("Constructor executed");
   }

   public static void main(String[] args) {
       System.out.println("Creating first object...");
       InitBlockExample obj = new InitBlockExample();

       System.out.println("Creating second object...");
       InitBlockExample obj2 = new InitBlockExample();
   }

}
