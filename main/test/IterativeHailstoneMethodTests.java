import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IterativeHailstoneMethodTests {
	@Test
	public void TrajectoryComputedCorrectly()
	{
		var method = new IterativeHailstoneMethod();
		var x = 5;
		var actual = method.ComputeTrajectory(x);
		var expected = 5;
		assertEquals(expected, actual);
	}	
}
