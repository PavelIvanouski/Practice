package by.it_academy.practice.practice10.game;

public class Player {
    private String name;

    private double hp;

    private Weapon weapon;

    private boolean isDead;

    private final static double DEFAULT_HP = 100;

    public Player(String name, Weapon weapon) {
        this.hp = DEFAULT_HP;

        this.name = name;
        this.weapon = weapon;

        weapon.use();
    }

    public void useWeapon(Player player) {
        validate();
        player.getDamaged(weapon.getDamage());
    }

    public void validate() {
        if (isDead){
            throw new RuntimeException("Player is dead");
        }
    }

    public void die() {
        hp = 0;
        weapon.drop();
        isDead = true;
    }

    public void getDamaged(double damage) {
        validate();

        hp -= damage;

        if (hp < 0) {
            die();
        }
    }

    public void changeWeapon(Weapon weapon) {
        validate();

        this.weapon.drop();
        this.weapon = weapon;
        weapon.use();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void view() {
        System.out.println("Player: " + name +
                " HP: " + hp +
                " Weapon: " + weapon.toString()
        );
    }
}