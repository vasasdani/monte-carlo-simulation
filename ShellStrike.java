package artillery;

import java.util.Random;

public class ShellStrike  {
	private Random r=new Random();
	private double x;
	private double y;
	private int StandarDeviation=50;
	
	//constructor for getting the Random distribution for x and y
	public ShellStrike (ComStrikePoint csp)
	{
		x=csp.getX()+r.nextGaussian()*StandarDeviation;
		y=csp.getY()+r.nextGaussian()*StandarDeviation;
	}
	/*return x after multiply by standard deviation and adding the x coordinate from the
	common point of injury which is the average for the current X*/
	public double getX()
	{
		return x;
	}
	/*return y after multiply by standard deviation and adding the y coordinate from the
	common point of injury which is the average for the current y*/
	public double getY()
	{
		return y;
	}

}
