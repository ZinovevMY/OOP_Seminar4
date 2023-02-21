package armors;

public class ChainMail implements Armor{
    @Override
    public int protection() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Кольчуга из чешуи дракона с защитой %d", protection());
    }
}
