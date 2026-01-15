package core.basesyntax;

import java.util.Random;

public class Lottery {

    public int getRandomBall() {
        int value = new Random().nextInt(100);
        return value;
    }
}
