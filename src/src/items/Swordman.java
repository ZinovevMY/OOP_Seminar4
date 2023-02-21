package items;

import weapons.Sword;

public class Swordman extends Warrior<Sword>{
    public Swordman(String name, Sword weapon){
        super(name, weapon);
    }

    @Override
    public String toString() {
        return super.toString() + "Специализация - мечник";
    }
}
