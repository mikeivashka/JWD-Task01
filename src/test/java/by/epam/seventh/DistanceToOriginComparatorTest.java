package by.epam.seventh;

import by.epam.utils.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static by.epam.seventh.DistanceToOriginComparator.getCloserPoint;

public class DistanceToOriginComparatorTest extends Assert {

    @Test
    public void testGetCloserPointDefault() {
        ArrayList<Point> lessThanTenRadius = new ArrayList<>();
        lessThanTenRadius.add(new Point(0, 0));
        lessThanTenRadius.add(new Point(3, 3));
        lessThanTenRadius.add(new Point(0, 9.999999));

        ArrayList<Point> moreThanTenRadius = new ArrayList<>();
        moreThanTenRadius.add(new Point(10, 0));
        moreThanTenRadius.add(new Point(9.999, 1));
        moreThanTenRadius.add(new Point(10, 10));

        for (int i = 0; i < moreThanTenRadius.size(); i++) {
            for (Point p : lessThanTenRadius) {
                assertEquals(p, getCloserPoint(p, moreThanTenRadius.get(i)));
            }
        }
    }
}