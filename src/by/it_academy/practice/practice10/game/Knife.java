package by.it_academy.practice.practice10.game;

public class Knife extends Weapon {
    String material;

    public Knife(String name, double damage, String material) {
        super(name, damage);

        this.material = material;
    }

    @Override
    public String toString() {
        return "Knife " +
                "name='" + getName() + '\'' +
                ", damage=" + getDamage() +
                ", isInUse=" + isInUse() +
                ", material=" + material;
    }
}