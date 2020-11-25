package by.epam.task07.t07;

public class DistanceToOriginComparator {
    public static Point getCloserPoint(Point p1, Point p2){
       return p1.distanceToOrigin() <= p2.distanceToOrigin() ? p1 : p2;
    }
}
