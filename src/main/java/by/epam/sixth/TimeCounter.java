package by.epam.sixth;

import java.time.Duration;
import java.time.LocalTime;

public class TimeCounter {
    private static final long SECONDS_IN_DAY = Duration.ofDays(1).toSeconds();

    public static LocalTime countByCurrentSecond(int second) {
        if (second < 1 || second > SECONDS_IN_DAY)
            throw new IllegalArgumentException("Second must be between 1 and 86400");
        return LocalTime.ofSecondOfDay(second-1);
    }

    public static LocalTime countByCurrentSecond(int second, boolean print) {
        LocalTime res = countByCurrentSecond(second);
        if (print) System.out.println(res);
        return res;
    }
}
