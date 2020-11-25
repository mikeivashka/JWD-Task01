package by.epam.task03.t03;

import org.junit.Assert;
import org.junit.Test;

public class SquareInsideCircleAreaCounterTest extends Assert {

    private static final double EPS = 1e-9;

    @Test
    public void testCountByCircumscribedCircleArea() {
        double[] testData = {16, 0.001};
        double[] expected = {8, 0.0005};
        for (int i=0; i<testData.length; i++){
            assertTrue(SquareInsideCircleAreaCounter.countByCircumscribedCircleArea(testData[i]) - expected[i] < EPS );
        }
    }
}