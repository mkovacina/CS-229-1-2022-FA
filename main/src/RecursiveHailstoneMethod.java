import javax.lang.model.util.ElementScanner14;

public class RecursiveHailstoneMethod implements HailstoneMethod 
{
	@Override
	public int ComputeTrajectory(int x) {
		// base case
		// but what if someone passes in 0 or -1
		// if ( x <= 1 ) return 0;
		if (x == 1) return 0;

		var xprime = 0;

		if (x % 2 == 0) 
		{
			xprime = x / 2;
			
			// var xprime /= 2;
			// bit-shift to do division by powers of 2 
			// var xprime = x >> 1;
		}
		else
		{
			xprime = 3*x+1;
		}
		
		var trajectory = ComputeTrajectory(xprime);
		return trajectory + 1;
	}
}
