package sk.stuba.fei.uim.oop;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int dice() {
        final int MIN = 1;
        final int MAX = 6;
        return ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
    }
//vrati cislo od 1-6
}
