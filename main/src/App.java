import java.time.Duration;
import java.time.Instant;

import javax.xml.stream.events.StartDocument;

public class App {
    public static void main(String[] args) throws Exception {
        // the current in milliseconds
        var startOld = System.currentTimeMillis();
        var endOld = System.currentTimeMillis();
        var dureationOld = endOld - startOld;

        var iterativeMethod = new IterativeHailstoneMethod();
        var iterativeDuration = Measure(iterativeMethod);

        var recursiveMethod = new RecursiveHailstoneMethod();
        var recursiveDuration = Measure(recursiveMethod);

        System.out.println("Recursive duration = "+recursiveDuration.toMillis());
        System.out.println("Iterative duration = "+iterativeDuration.toMillis());
    }

    public static Duration Measure(HailstoneMethod method)
    {
        var start = Instant.now();

        for(int x = 0; x < 1000000; x++)
        {
            var trajectory = method.ComputeTrajectory(314159);
        }

        var end = Instant.now();

        var duration = Duration.between(start, end);

        return duration;
    }
}

