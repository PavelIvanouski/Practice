package by.it_academy.practice.practice24.solid.dip.violation;

public class LightBulp {

   private boolean isOn;

   public boolean isOn() {
       return isOn;
   }

   public void turnOn() {
       isOn = true;
       System.out.println("Light is on");
   }

   public void turnOff() {
       isOn = false;
       System.out.println("Light is off");
   }

   public boolean isOff() {
       return true;
   }

}
