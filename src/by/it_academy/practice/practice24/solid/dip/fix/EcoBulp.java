package by.it_academy.practice.practice24.solid.dip.fix;

public class EcoBulp implements Switchable{

   private boolean isOn;

   public boolean isOn() {
       return isOn;
   }

   public void turnOn() {
       isOn = true;
       System.out.println("Eco light is on");
   }

   public void turnOff() {
       isOn = false;
       System.out.println("Eco light is off");
   }

   public boolean isOff() {
       return true;
   }

}
