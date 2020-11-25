package by.epam.first;


import org.junit.Assert;
import org.junit.Test;

import static by.epam.first.SquareLastDigitCounter.count;

public class SquareLastDigitCounterTest extends Assert {
    @Test
    public void testCountNull() {
        try {
            count(null);
            fail();
        } catch (NullPointerException e) {
        }

    }

    @Test
    public void testCountDigits() {
        final int[] testData = new int[]{0, 1, 9};
        final int[] expected = new int[]{0, 1, 1};

        for (int i = 0; i < testData.length; i++) {
            assertEquals(expected[i], count(testData[i]));
        }
    }

    @Test
    public void testCountDefault() {
        final int[] testData = new int[]{10, 123, 9};
        final int[] expected = new int[]{0, 9, 1};

        for (int i = 0; i < testData.length; i++) {
            assertEquals(expected[i], count(testData[i]));
        }
    }

    @Test
    public void testCountNegative() {
        final int[] testData = new int[]{-10, -123, -9};
        final int[] expected = new int[]{0, 9, 1};

        for (int i = 0; i < testData.length; i++) {
            assertEquals(expected[i], count(testData[i]));
        }
    }

    @Test
    public void testCountMinMax() {
        final int[] testData = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        final int[] expected = new int[]{9, 4};
        for (int i = 0; i < testData.length; i++) {
            assertEquals(expected[i], count(testData[i]));
        }
    }
}