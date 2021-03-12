package artillery;

public class Structure {
	
	private double Xmin,Ymin,Xmax,Ymax;
	/*a constructor who will produce the domains of the specific structure, 
	which if coordinates of a particular shell are in the domain, then the structure is damaged*/
	public Structure(double centerX,double centerY,double Length,double Width)
	{
		Xmin=centerX-Width/2;
		Xmax=centerX+Width/2;
		Ymin=centerY-Length/2;
		Ymax=centerY+Length/2;
	}
	
	public boolean isDamaged(ShellStrike shell)
	{
		/*return a boolean expression which check if the 
		  specific shells coordinates has been hit the structure*/
		return (Xmin<=shell.getX()&&shell.getX()<=Xmax)&&
			   (Ymin<=shell.getY()&&shell.getY()<=Ymax);
	}
	

}
