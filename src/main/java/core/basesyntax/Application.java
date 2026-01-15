package core.basesyntax;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery();
        Ball ball = new Ball(colorSupplier.getRandomColor(),
                lottery.getRandomBall());
        Ball ball2 = new Ball(colorSupplier.getRandomColor(),
                lottery.getRandomBall());
        Ball ball3 = new Ball(colorSupplier.getRandomColor(),
                lottery.getRandomBall());
        Ball [] balls = {ball, ball2, ball3};
        System.out.println(Arrays.toString(balls));

    }
}
