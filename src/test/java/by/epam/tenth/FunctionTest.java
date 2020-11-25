package by.epam.tenth;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest extends Assert {

    @Test
    public void testValues() {
        Function.values(0, 3, 0.1, true);
    }
}