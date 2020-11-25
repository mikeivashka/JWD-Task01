package by.epam.third;

class SquareInsideCircleAreaCounter {
    public static double countByCircumscribedCircleArea(double area){
        double diameter = Math.sqrt(area);
        return Math.pow(diameter, 2) / 2;
    }
}
