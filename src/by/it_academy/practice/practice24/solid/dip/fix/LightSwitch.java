package by.it_academy.practice.practice24.solid.dip.fix;

public class LightSwitch {

   private Switchable switchable;

   public LightSwitch(Switchable switchable) {
       this.switchable = switchable;
   }

   public void toggle() {
       if (switchable.isOn()) {
           switchable.turnOff();
       } else {
           switchable.turnOn();
       }
   }
}
