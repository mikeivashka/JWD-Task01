package by.epam.task06.t06;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static by.epam.task06.t06.TimeCounter.countByCurrentSecond;

public class TimeCounterTest extends Assert {

    @Test
    public void testCountByCurrentSecondValid() {
        int[] testData = {1, 86400};
        List<LocalTime> expected = new ArrayList<>();
        expected.add(LocalTime.of(0, 0, 0));
        expected.add(LocalTime.of(23, 59, 59));

        for (int i = 0; i < testData.length; i++){
            assertEquals(expected.get(i), TimeCounter.countByCurrentSecond(testData[i]));
        }
    }

    @Test
    public void testCountByCurrentSecondException() {
        int[] testData = {-1, 0, 86401};
        for (int i : testData) {
            try {
                TimeCounter.countByCurrentSecond(i);
                fail();
            } catch (IllegalArgumentException e) {
            }
        }
    }

}