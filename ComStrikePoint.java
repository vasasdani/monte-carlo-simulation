package artillery;

import java.util.Random;

public class ComStrikePoint {

    private static final int STANDARD_DEVIATION = 100;
    private static final Random rand = new Random();
    private final double x;
    private final double y;

    //constructor for getting the Random distribution for x and y Coordinates
    public ComStrikePoint() {
        //Initialize random variables in order to get Random distribution
        x = rand.nextGaussian() * STANDARD_DEVIATION;
        y = rand.nextGaussian() * STANDARD_DEVIATION;
    }

    //return x after multiply by standard deviation, the average around (0,0)-given fact
    public double getX() { return x; }

    //return y after multiply by standard deviation, , the average around (0,0)-given fact
    public double getY() {
        return y;
    }


}
