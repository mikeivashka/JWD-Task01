package by.epam.fifth;

public class PerfectNumberChecker {
    private static Long getDivisorsSum(Long number) {
        assert number >= 1;
        Long result = 1L;
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                result += i;
                if (number / i != i) result += number / i;
            }
        }
        return result;
    }

    public static boolean isPerfect(Long number) {
        return isPerfect(number, false);
    }

    public static boolean isPerfect(Long number, boolean print) {
        if (number < 2) return false;
        boolean result = getDivisorsSum(number).equals(number);
        if (print) System.out.println(number);
        return result;
    }
}
