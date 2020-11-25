package by.epam.task08.t08;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.task08.t08.Function.getValue;

public class FunctionTest extends Assert {
    double EPS = 1e-10;

    @Test
    public void testGetValueLessThan3() {
        double[] testData = {1, 2};
        double[] expected = {-0.2, 0.5};
        run(expected, testData);
    }

    @Test
    public void testGetValueMoreThan3() {
        double[] testData = {4, 5};
        double[] expected = {5, -1};
        run(expected, testData);
    }

    @Test
    public void testGetValue3() {
        double[] testData = {3};
        double[] expected = {9};
        run(expected, testData);
    }

    @Test
    public void testZeroDivisionReturnsPositiveInfinity() {
        double[] testData = {Math.pow(6, 1. / 3)};
        double[] expected = {Double.POSITIVE_INFINITY};
        run(expected, testData);
    }

    private void run(double[] expected, double[] testData) {
        for (int i = 0; i < testData.length; i++) {
            assertEquals(expected[i], getValue(testData[i]), EPS);
        }
    }
}