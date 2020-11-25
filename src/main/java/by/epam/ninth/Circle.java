package by.epam.ninth;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        if (radius >= 0) this.radius = radius;
        else throw new IllegalArgumentException("Radius must be less or equal to zero");
    }

    public double circumference() {
        return Math.PI * radius * 2;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
