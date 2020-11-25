package by.epam.forth;

public class AtLeastTwoNumbersEven {
    public static boolean check(int a, int b, int c, int d , boolean printResult){
        boolean res = a%2 + b%2 + c%2 + d%2 < 3;
        if(printResult)System.out.println(res);
        return res;
    }
}
