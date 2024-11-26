package by.it_academy.practice.practice21.synchronizedExample.method;

public class Counter {

   private int count;

   public synchronized void increment() {
       try {
           Thread.sleep(1);
       } catch (InterruptedException e) {}

       count++;
   }
  
   public int getCount() {
       return count;
   }
}
