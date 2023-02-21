package armors;

public class Helmet implements Armor{
    @Override
    public int protection() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Воинский шлем с защитой %d", protection());
    }
}
