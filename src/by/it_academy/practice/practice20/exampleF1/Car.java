package by.it_academy.practice.practice20.exampleF1;

public class Car {
    public void replaceWheel(String wheelPosition) {
        System.out.println("Replacing " + wheelPosition + " wheel...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wheel replaced...");
    }
}
