package by.epam.task02.t02;

import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;


public class DaysMonthCounterTest extends Assert {
    @Test
    public void testCountByYearAndMonth() {
        assertEquals(30, DaysMonthCounter.countByYearAndMonth(2020, 11));
        assertEquals(29, DaysMonthCounter.countByYearAndMonth(2020, 2));
    }

    @Test
    public void testCountByYearAndMonthNegative() {
        try {
            DaysMonthCounter.countByYearAndMonth(-100, -200);
            fail();
        }
        catch (DateTimeException e){}
    }}