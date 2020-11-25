package by.epam.task09.t09;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CircleCircumferenceTest extends Assert {
    private final Circle testData;
    private final double expected;
    private final double EPS = 1e-5;

    public CircleCircumferenceTest(Circle testData, double expected) {
        this.testData = testData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {new Circle(3), 18.84956}, // Positive
                {new Circle(0.5), Math.PI},
                {new Circle(0), 0}, // Negative
        });
    }

    @Test
    public void testCircumference() {
        assertEquals(expected, testData.circumference(), EPS);
    }
}