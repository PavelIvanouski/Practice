package by.it_academy.practice.practice20.exampleRunnable;

public class Main {
   public static void main(String[] args) {
       CustomThread helloRunnable = new CustomThread();
       Thread thread = new Thread(helloRunnable);

//       Thread threadLambda = new Thread(() -> System.out.println("Hello World"));
//       threadLambda.start();


       thread.start();


       try {
           Thread.sleep(100);
       } catch (InterruptedException e) {
           throw new RuntimeException();
       }
       System.out.println("Hello from main thread!");
   }

}
