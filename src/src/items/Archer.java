package items;

import weapons.Bow;

public class Archer extends Warrior implements DistanceAttacker{

    private int distance;
    public Archer(String name, Bow weapon){
        super(name, weapon);
        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance(){
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Специализация - лучник, дальность выстрела %d", distance);
    }
}
