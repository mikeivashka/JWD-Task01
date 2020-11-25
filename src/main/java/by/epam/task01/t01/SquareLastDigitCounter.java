package by.epam.task01.t01;
class SquareLastDigitCounter{
    public static Integer count(Integer number){
        return ((number%10) * (number%10))%10;
    }
}
