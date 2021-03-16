package sk.stuba.fei.uim.oop.game;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int dice() {
        final int MIN = 1;
        final int MAX = 6;
        int number= ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        return number;
    }

}
