package by.epam.task09.t09;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CircleAreaTest extends Assert {
    private final Circle testData;
    private final double expected;
    private final double EPS = 1e-5;

    public CircleAreaTest(Circle testData, double expected) {
        this.testData = testData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {new Circle(3), 28.274334}, // Positive
                {new Circle(0.5), 0.785398},
                {new Circle(0), 0}, // Negative
        });
    }

    @Test
    public void testArea() {
        assertEquals(expected, testData.area(), EPS);
    }

}
