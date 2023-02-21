package items;

import armors.Armor;
import weapons.Weapon;

import java.util.Random;

public abstract class Warrior<T extends Weapon, V extends Armor> {
    private String name;
    protected T weapon;
    protected V helmet, shield, chainmail;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T weapon, V helmet, V shield, V chainmail) {
        this.name = name;
        this.weapon = weapon;
        this.helmet = helmet;
        this.shield = shield;
        this.chainmail = chainmail;
        healthPoint = 100;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    @Override
    public String toString() {
        return String.format("Воин %s вооружен %s %d единиц здоровья", name, weapon, healthPoint);
    }
}
