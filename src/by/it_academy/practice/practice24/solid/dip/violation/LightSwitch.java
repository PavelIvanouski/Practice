package by.it_academy.practice.practice24.solid.dip.violation;

public class LightSwitch {

   private LightBulp lightBulp;

   public LightSwitch(LightBulp lightBulp) {
       this.lightBulp = lightBulp;
   }

   public void toggle() {
       if (lightBulp.isOn()) {
           lightBulp.turnOff();
       } else {
           lightBulp.turnOn();
       }
   }
}
