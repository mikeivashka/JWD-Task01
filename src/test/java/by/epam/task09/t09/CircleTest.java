package by.epam.task09.t09;

import org.junit.Assert;
import org.junit.Test;


public class CircleTest extends Assert {
    private final double EPS = 1e-5;

    @Test
    public void testCircumference() {
        final Circle[] testData = new Circle[]{new Circle(3), new Circle(0.5), new Circle(0)};
        final double[] expected = new double[]{18.84956, Math.PI, 0};
        run(testData, expected);
    }

    @Test
    public void testArea() {
        final Circle[] testData = new Circle[]{new Circle(3), new Circle(0.5), new Circle(0)};
        final double[] expected = new double[]{28.274334, 0.785398, 0};

    }

    private void run(Circle[] testData, double[] expected){
        for (int i = 0; i < testData.length; i++) {
            assertEquals(expected[i], testData[i].circumference(), EPS);
        }
    }
}