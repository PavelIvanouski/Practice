package by.it_academy.practice.practice10.game;

public abstract class Weapon {
    private String name;
    private double damage;
    private boolean isInUse;

    public Weapon(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public void use() {
        if (isInUse) {
            System.out.println("You are already in use!");

        }

        isInUse = true;
    }

    public void drop() {
        isInUse = false;
    }

    public boolean isInUse() {
        return isInUse;
    }

    @Override
    public String toString() {
        return "Weapon " +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", isInUse=" + isInUse;
    }
}