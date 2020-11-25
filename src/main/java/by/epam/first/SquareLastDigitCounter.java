package by.epam.first;
class SquareLastDigitCounter{
    public static int count(Integer number){
        return ((number%10) * (number%10))%10;
    }
}
