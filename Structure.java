package artillery;

public class Structure {

    private final double xMin, yMin, xMax, yMax;

    /*a constructor who will produce the domains of the specific structure,
    which if coordinates of a particular shell are in the domain, then the structure is damaged*/
    public Structure(double centerX, double centerY, double Length, double Width) {
        xMin = centerX - Width / 2;
        xMax = centerX + Width / 2;
        yMin = centerY - Length / 2;
        yMax = centerY + Length / 2;
    }

    public boolean isDamaged(ShellStrike shell) {
		/*return a boolean expression which check if the 
		  specific shells coordinates has been hit the structure*/
        return (xMin <= shell.getX() && shell.getX() <= xMax) &&
                (yMin <= shell.getY() && shell.getY() <= yMax);
    }


}
