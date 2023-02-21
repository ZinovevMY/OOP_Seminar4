package weapons;

public class Sword extends Weapon{

    @Override
    public int damage() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Меч-кладенец, урон %d", damage());
    }
}
