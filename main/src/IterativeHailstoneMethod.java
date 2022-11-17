public class IterativeHailstoneMethod implements HailstoneMethod{

	@Override
	public int ComputeTrajectory(int x) {
		int count = 0;
		while(x > 1)
		{
			if (x % 2 == 0) 
			{
				// do something
				x = x / 2;
			}
			else
			{
				// do something else
				x = 3*x+1;
			}
			
			count++;
		}
		return count;
	}
}
