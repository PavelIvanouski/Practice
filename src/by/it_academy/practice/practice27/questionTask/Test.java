package by.it_academy.practice.practice27.questionTask;
import static by.it_academy.practice.practice27.questionTask.Test2.N;

class Test2 {
   static int N(Integer x) {
       return x;
   }
}

public class Test {
   static int M(Integer v) {
       return v;
   }

   public static void main(String[] args) {
       Integer x =  M(100); // 1
       Integer z =  N(100); // 2
       System.out.println(x + " " + z);
   }
}
