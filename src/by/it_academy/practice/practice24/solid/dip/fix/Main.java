package by.it_academy.practice.practice24.solid.dip.fix;

public class Main {
    public static void main(String[] args) {
        Switchable lightBulp = new LightBulp();
        Switchable ecoBulp = new EcoBulp();

        LightSwitch lightSwitch = new LightSwitch(lightBulp);
        lightSwitch.toggle();
        lightSwitch.toggle();
        LightSwitch ecoLightSwitch = new LightSwitch(ecoBulp);
        ecoLightSwitch.toggle();
        ecoLightSwitch.toggle();
    }
}
