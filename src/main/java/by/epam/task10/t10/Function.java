package by.epam.task10.t10;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public static double getValue(double x) {
        return Math.tan(x);
    }

    public static List<Double> values(double a, double b, double h) {
        if (h <= 0 || a > b) throw new IllegalArgumentException("h must be >0 and a must be less or equal to b");
        if((b-a)/h > 10e5)throw new IllegalArgumentException("Can't create table for values, ((b-a)/h) must be less or equal to 10e5 to avoid OutOfMemoryError");
        ArrayList<Double> values = new ArrayList<>((int) ((b - a) / h + 1));
        List<Double> points = splitSegment(a, b, h);
        points.forEach(p -> values.add(getValue(p)));
        return values;
    }

    public static List<Double> values(double a, double b, double h, boolean print) {
        List<Double> result = values(a, b, h);
        if (print) {
            List<Double> points = splitSegment(a, b, h);
            printTable(result, points);
        }
        return result;
    }

    private static List<Double> splitSegment(double a, double b, double h) {
        ArrayList<Double> result = new ArrayList<>((int) ((b - a) / h + 1));
        while (a < b) {
            result.add(a);
            a += h;
        }
        result.add(b);
        return result;
    }

    private static void printTable(List<Double> values, List<Double> points) {
        if (values.size() != points.size()) throw new IllegalArgumentException("Arrays must have same lenght");
        for (int i = 0; i < points.size(); i++) {
            System.out.println("X: " + points.get(i) + "\tF(x)" + values.get(i));
        }
    }
}
