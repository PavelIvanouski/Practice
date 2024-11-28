package by.it_academy.practice.practice22_1.semaphoreExample;

import java.util.concurrent.Semaphore;

class Worker implements Runnable {
   Semaphore semaphore;

   Worker(Semaphore semaphore) {
       this.semaphore = semaphore;
   }

   public void run() {
       try {
           for (int i = 1; i < 5; i++) {
               // получения разрешения
               semaphore.acquire();
               System.out.println("Thread " + Thread.currentThread().getName() + " is waiting for work");
               Thread.sleep(1000);

               //освободить разрешение
               semaphore.release();
               System.out.println("Thread " + Thread.currentThread().getName() + " released...");
           }
       } catch (InterruptedException e) {
           /* ... */
       }
   }
}
