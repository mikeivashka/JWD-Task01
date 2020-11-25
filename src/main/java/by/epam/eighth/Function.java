package by.epam.eighth;

public class Function {
    public static double getValue(double x) {
        if (x >= 3) return -x * x + 3 * x + 9;
        else return 1 / (x * x * x - 6);
    }
}
