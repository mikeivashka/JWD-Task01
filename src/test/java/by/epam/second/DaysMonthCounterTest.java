package by.epam.second;

import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;

import static by.epam.second.DaysMonthCounter.countByYearAndMonth;


public class DaysMonthCounterTest extends Assert {
    @Test
    public void testCountByYearAndMonth() {
        assertEquals(30, countByYearAndMonth(2020, 11));
        assertEquals(29, countByYearAndMonth(2020, 2));
    }

    @Test
    public void testCountByYearAndMonthNegative() {
        try {
            countByYearAndMonth(-100, -200);
            fail();
        }
        catch (DateTimeException e){}
    }}