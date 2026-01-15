package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final Lottery lottery = new Lottery();
    private static final Ball [] balls = new Ball[3];

    public static void main(String[] args) {
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));

    }
}
