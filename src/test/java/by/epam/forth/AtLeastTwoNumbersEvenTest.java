package by.epam.forth;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.forth.AtLeastTwoNumbersEven.check;

public class AtLeastTwoNumbersEvenTest extends Assert {
    @Test
    public void testCheckAllEven(){
        assertTrue(check(0, 2, 4 ,8, false));
    }

    @Test
    public void testCheck2Even(){
        assertTrue(check(3, 5, 8, 10, false));
    }

    @Test
    public void testCheck1Even(){
        assertFalse(check(1, 3, 5, 8, false));
    }
}