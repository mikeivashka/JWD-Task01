package by.epam.task05.t05;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static by.epam.task05.t05.PerfectNumberChecker.isPerfect;

public class PerfectNumberCheckerTest extends Assert {

    @Test
    public void testIsPerfectAllTrue() {

        Long[] testData = {6L, 28L, 496L, 8128L, 33_550_336L, 8_589_869_056L};
        for (long i : testData) {
            assertTrue(isPerfect(i));
        }
    }

    @Test
    public void testIsPerfectInvalid() {
        Long[] testData = {0L, -1L, -20000000L, Long.MIN_VALUE};
        for (long i : testData) {
            assertFalse(isPerfect(i));
        }
    }

    @Test
    public void testIsPerfectValidNotPerfect() {
        Long[] testData = {1L, 5L, 100L, 20000000L};
        for (long i : testData) {
            assertFalse(isPerfect(i));
        }
    }

    @Ignore
    @Test(timeout = 30000)
    public void testIsPerfectLongMaxValue() {
        isPerfect(Long.MAX_VALUE);
    }
}