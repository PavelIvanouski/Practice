package by.it_academy.practice.practice21.collisionExample;

public class Counter {

   private int count;

   public  void increment() {
       try {
           Thread.sleep(1);
       } catch (InterruptedException e) {}

       count++;
   }
  
   public int getCount() {
       return count;
   }
}
