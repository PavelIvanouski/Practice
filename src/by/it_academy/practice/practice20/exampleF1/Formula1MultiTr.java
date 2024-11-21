package by.it_academy.practice.practice20.exampleF1;

public class Formula1MultiTr {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Start pit stop...");

        long startTime = System.currentTimeMillis();

        Thread frontLeftThread = new Thread(() -> car.replaceWheel("front left"));
        Thread frontRightThread = new Thread(() -> car.replaceWheel("front right"));
        Thread rearLeftThread = new Thread(() -> car.replaceWheel("rear left"));
        Thread rearRightThread = new Thread(() -> car.replaceWheel("rear right"));

        frontLeftThread.start();
        frontRightThread.start();
        rearLeftThread.start();
        rearRightThread.start();

        try {
            frontLeftThread.join();
            frontRightThread.join();
            rearLeftThread.join();
            rearRightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Pit stop completed in " + (endTime - startTime) + " milliseconds");

    }

}
