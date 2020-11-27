package by.epam.task10.t10;


import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static by.epam.task10.t10.Function.*;

public class FunctionTest extends Assertions {

    private static Stream<Arguments> provideValuesToSegmentSplitting() {
        return Stream.of(
                Arguments.of(-10, 10, 1, 21),
                Arguments.of(0, 1, 1, 2),
                Arguments.of(0, 0, 1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "provideValuesToSegmentSplitting")
    public void testSegmentSplitting(double a, double b, double h, int expected) {
        assertEquals(expected, values(a, b, h).size());
    }

    @ParameterizedTest
    @CsvSource({"0, -0.1", "10e9, 10e8"})
    public void testFailsIfBLessThanA(double a, double b) {
        assertThrows(
                IllegalArgumentException.class,
                () -> values(a, b, 10e4 * Math.random())
        );
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, -10e-9, Double.NEGATIVE_INFINITY, 0})
    public void testFailsIfHNegativeOrZero(double h){
        double a = Math.random()*10e9 - 10e9/2;
        double b = a + Math.random()*10e9 - 10e9/2;
        Exception res = assertThrows(
                IllegalArgumentException.class,
                ()->values(a, b, h)
        );
        assertEquals("h must be >0 and a must be less or equal to b", res.getMessage());
    }

    @Test
    public void testFailsIfTableSizeTooBig(){
        Exception res = assertThrows(
                IllegalArgumentException.class,
                () -> values(0, 10e5 + 1, 1)
        );
        String expected = "Can't create table for values, ((b-a)/h) must be less or equal to 10e5 to avoid OutOfMemoryError";
        assertEquals(expected, res.getMessage());
    }

    @Ignore
    @Test
    public void printValuesTest() {
        values(0, 3, 0.1, true);
    }
}