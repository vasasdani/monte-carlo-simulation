package artillery;

import java.util.Random;

public class ComStrikePoint {
	private int StandarDeviation=100;
	
	//Initialize random variables in order to get Random distribution
	private Random rand=new Random();
	private double x,y;
	//constructor for getting the Random distribution for x and y Coordinates 
	public ComStrikePoint()
	{
		x=rand.nextGaussian()*StandarDeviation;
		y=rand.nextGaussian()*StandarDeviation;
	}
	//return x after multiply by standard deviation, the average around (0,0)-given fact
	public double getX()
	{
		return x;
	}
	//return y after multiply by standard deviation, , the average around (0,0)-given fact
	public double getY()
	{
		return y;
	}
	

}
