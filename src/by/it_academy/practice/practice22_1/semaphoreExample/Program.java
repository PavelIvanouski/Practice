package by.it_academy.practice.practice22_1.semaphoreExample;

import java.util.concurrent.Semaphore;

public class Program {

   public static void main(String[] args) {
       // 1 permit
       Semaphore semaphore = new Semaphore(1);
       for (int i = 1; i < 10; i++) {
           Worker worker = new Worker(semaphore);
           new Thread(worker).start();
       }
   }
}
