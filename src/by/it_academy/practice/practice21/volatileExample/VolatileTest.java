package by.it_academy.practice.practice21.volatileExample;

public class VolatileTest {

    private static  int volatileInt = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int localValue = volatileInt;
            while (localValue < 5) {
                if (localValue != volatileInt) {
                    System.out.printf("Got Change for MY_INT : %s%n", volatileInt);
                    localValue = volatileInt;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {
            int localValue = volatileInt;
            while (volatileInt < 5) {
                System.out.printf("Incrementing MY_INT to %s%n",
                        localValue + 1);
                volatileInt = ++localValue;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
