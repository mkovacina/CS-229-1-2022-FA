import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursiveHailstoneMethodTests {
	@Test
	public void TrajectoryComputedCorrectly()
	{
		var method = new RecursiveHailstoneMethod();
		var x = 5;
		var actual = method.ComputeTrajectory(x);
		var expected = 5;
		assertEquals(expected, actual);
	}
}
