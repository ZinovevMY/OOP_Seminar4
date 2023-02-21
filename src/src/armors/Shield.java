package armors;

public class Shield implements Armor{
    @Override
    public int protection() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Щит квадратный металлический с защитой %d", protection());
    }
}
