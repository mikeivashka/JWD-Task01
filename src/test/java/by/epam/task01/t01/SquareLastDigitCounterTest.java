package by.epam.task01.t01;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SquareLastDigitCounterTest extends Assert {

    private final Integer[] testData;
    private final Integer[] expected;

    public SquareLastDigitCounterTest(Integer[] testData, Integer[] expected) {
        this.testData = testData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[][]> testCases() {
        return Arrays.asList(new Integer[][][]{
                {{0, 1, 9}, {0, 1, 1}}, // Digits
                {{10, 123, 9}, {0, 9, 1}}, // Default
                {{-10, -123, -9}, {0, 9, 1}}, // Negative
                {{Integer.MAX_VALUE, Integer.MIN_VALUE}, {9, 4}} // Min & Max
        });
    }

    @Test
    public void testCountNull() {
        try {
            SquareLastDigitCounter.count(null);
            fail();
        } catch (NullPointerException e) {}

    }

    @Test
    public void testCountDefault() {
        for (int i = 0; i < testData.length; i++) {
            assertEquals(expected[i], SquareLastDigitCounter.count(testData[i]));
        }
    }

}