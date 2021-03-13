package artillery;

import java.util.Random;

public class ShellStrike {
    //This could've been moved to constructor as well, but it's good for better reading.
    //The usual naming convention to start with a small letter and then camel casing
    private static final int STANDARD_DEVIATION = 50;
    private static final Random r = new Random();
    private final double x;
    private final double y;

    //constructor for getting the Random distribution for x and y
    public ShellStrike(ComStrikePoint csp) {
        x = csp.getX() + r.nextGaussian() * STANDARD_DEVIATION;
        y = csp.getY() + r.nextGaussian() * STANDARD_DEVIATION;
    }

    /*return x after multiply by standard deviation and adding the x coordinate from the
    common point of injury which is the average for the current X*/
    public double getX() {
        return x;
    }

    /*return y after multiply by standard deviation and adding the y coordinate from the
    common point of injury which is the average for the current y*/
    public double getY() {
        return y;
    }

}
